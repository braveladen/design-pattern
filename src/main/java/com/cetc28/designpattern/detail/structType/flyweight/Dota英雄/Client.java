package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:19
 * @description：调用类
 * 每一轮游戏都有一个影魔的角色，这些影魔角色都是不同对象，因为它们的血量和魔量都不一样；
 * 但是，这些对象又共用同一个影魔英雄实例，因为影魔的名称和技能都一样，这部分是可以共用的。
 * 享元模式的作用在于：
 * 1、通过把共享对象抽取出来，只创建一份并在各对象之间共享，来防止大量创建对象；
 * 享元模式
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        //假设有四个solo局，则使用了享元模式的情况下，其实恶魔巫师和影魔的实例各自只有一个
        HeroManager heroManager = HeroManager.getInstance();
        Role role1 = new Role(heroManager.getHero("恶魔巫师"));
        Role role2 = new Role(heroManager.getHero("影魔"));

        Role role3 = new Role(heroManager.getHero("恶魔巫师"));
        Role role4 = new Role(heroManager.getHero("影魔"));

        Role role5 = new Role(heroManager.getHero("恶魔巫师"));
        Role role6 = new Role(heroManager.getHero("影魔"));

        Role role7 = new Role(heroManager.getHero("恶魔巫师"));
        Role role8 = new Role(heroManager.getHero("影魔"));
    }
}
