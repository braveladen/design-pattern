package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:17
 * @description：英雄角色
 * 这是对象的非共享部分，这部分内容每个对象实例都不一样。
 * 对象的共享部分与非共享部分组成了对象的完整形态，其中：
 * 1、每一个对象的共享部分对象，都是从池里获取的，即只有一个共享部分对象；
 * 2、每一个对象的非共享部分单独定义，因为每个对象都不一样。
 * @modified By：
 * @version: $
 */
//用于组合英雄内部状态和外部状态的类，假设称为角色
public class Role {

    private AbstractHero hero;//角色选择的英雄

    //我们把血量和魔法量这两个外部状态从英雄里剥离出来，放到外部的角色类中
    private long hp;

    private long mp;

    public Role(AbstractHero hero) {
        super();
        this.hero = hero;
    }

    //释放技能
    public void release(int index){
        hero.release(index);
    }

    //物理攻击
    public void commonAttack(){
        hero.commonAttack();
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getMp() {
        return mp;
    }

    public void setMp(long mp) {
        this.mp = mp;
    }

}
