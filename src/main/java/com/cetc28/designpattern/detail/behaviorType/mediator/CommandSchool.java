package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:52
 * @description：命令门
 * @modified By：
 * @version: $
 */
public class CommandSchool extends School {
    public CommandSchool(IPatternAlliance patternAlliance){
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "命令门";
    }
}
