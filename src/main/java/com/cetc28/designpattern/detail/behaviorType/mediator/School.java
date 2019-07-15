package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:50
 * @description：门派抽象类
 *
 * @modified By：
 * @version: $
 */
public abstract class School {
    protected IPatternAlliance patternAlliance;

    public School(IPatternAlliance patternAlliance) {
        super();
        this.patternAlliance = patternAlliance;
    }

    public void defense() {
        System.out.println(getName() + "防御");
    }

    public void attack(School school) {
        System.out.println(getName() + "攻击" + school.getName());
    }

    //有了中介者，将由中介者处理
    public void attackByPatternAlliance(School school){
        patternAlliance.resolveAttack(this, school);
    }

    public void defenseByPatternAlliance(){
        patternAlliance.resolveDefense(this);
    }

    public abstract String getName();
}
class CommandSchool extends School {
    public CommandSchool(IPatternAlliance patternAlliance){
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "命令门";
    }
}
class SingletonSchool extends School{

    public SingletonSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "单例宗";
    }

}
class StrategySchool extends School{

    public StrategySchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    @Override
    public String getName() {
        return "策略宫";
    }

}
class MediatorSchool extends School{

    public MediatorSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    @Override
    public String getName() {
        return "中介者神阁";
    }

}
