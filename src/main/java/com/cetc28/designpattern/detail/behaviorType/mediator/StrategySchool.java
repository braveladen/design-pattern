package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:55
 * @description：策略宫
 * @modified By：
 * @version: $
 */
public class StrategySchool extends School{

    public StrategySchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    @Override
    public String getName() {
        return "策略宫";
    }

}
