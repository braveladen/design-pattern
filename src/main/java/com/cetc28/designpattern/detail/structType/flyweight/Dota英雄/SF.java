package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:16
 * @description：英雄：影魔
 * 抽象共享类的子类，进一步定义抽象方法的实现。
 * @modified By：
 * @version: $
 */
public class SF extends AbstractHero{
    @Override
    public String getName() {
        return "影魔";
    }
    @Override
    public void initSkills() {
        skills[0] = "毁灭阴影";
        skills[1] = "支配死灵";
        skills[2] = "魔王降临";
        skills[3] = "魂之挽歌";
    }

}
