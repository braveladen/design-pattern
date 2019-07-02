package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:55
 * @description：大陆格局
 * @modified By：
 * @version: $
 */
public class ContinentalPattern {
    public static void main(String[] args) {
        IPatternAlliance patternAlliance = new PatternAlliance();

        School singletonSchool = new SingletonSchool(patternAlliance);
        School commandSchool = new CommandSchool(patternAlliance);
        School mediatorSchool = new MediatorSchool(patternAlliance);

        School strategySchool = new StrategySchool(patternAlliance);

        //策略宫没有被联盟收留
        patternAlliance.add(mediatorSchool);
        patternAlliance.add(commandSchool);
        patternAlliance.add(singletonSchool);

        singletonSchool.attackByPatternAlliance(mediatorSchool);
        commandSchool.attackByPatternAlliance(mediatorSchool);
        System.out.println("------------------------------------------------------");
        mediatorSchool.attackByPatternAlliance(strategySchool);
        System.out.println("------------------------------------------------------");
        strategySchool.attackByPatternAlliance(mediatorSchool);
        mediatorSchool.defenseByPatternAlliance();
        System.out.println("------------------------------------------------------");
    }
}
