package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:54
 * @description：中介者神阁
 * @modified By：
 * @version: $
 */

public class MediatorSchool extends School{

    public MediatorSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    @Override
    public String getName() {
        return "中介者神阁";
    }

}
