package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/1 9:54
 * @description：单例宗
 * @modified By：
 * @version: $
 */
public class SingletonSchool extends School{

    public SingletonSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "单例宗";
    }

}
