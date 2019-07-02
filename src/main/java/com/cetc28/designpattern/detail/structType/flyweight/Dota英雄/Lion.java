package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:16
 * @description：英雄：恶魔巫师
 * 抽象共享类的子类，进一步定义抽象方法的实现。
 * @modified By：
 * @version: $
 */
public class Lion extends AbstractHero{
    @Override
    public String getName() {
        return "恶魔巫师";
    }
    @Override
    public void initSkills() {
        skills[0] = "穿刺";
        skills[1] = "妖术";
        skills[2] = "法力汲取";
        skills[3] = "死亡一指";
    }

}