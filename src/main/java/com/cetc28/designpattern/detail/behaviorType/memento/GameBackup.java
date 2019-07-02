package com.cetc28.designpattern.detail.behaviorType.memento;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 19:44
 * @description：备忘录角色
 * @modified By：
 * @version: $
 */
/**
 * 备忘录角色，
 * 存储备份游戏角色的各个属性
 */
public class GameBackup {
    private String name;
    private int hp;
    private int mp;
    private int level;

    public GameBackup(String name,int hp,int mp,int level){
        this.name=name;
        this.hp=hp;
        this.mp=mp;
        this.level=level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getLevel() {
        return level;
    }
}
