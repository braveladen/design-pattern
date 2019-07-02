package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:15
 * @description：抽象英雄基类
 * 对象的可共享部分，抽取出来，封装为一个抽象类。
 * 本例中，每个英雄的名称和技能都是一样的，因此是共享部分。
 * @modified By：
 * @version: $
 */
public abstract class AbstractHero {

    protected final String name;//英雄名称

    protected final String[] skills = new String[4];//每个英雄都有四个技能

    public AbstractHero() {
        super();
        this.name = getName();
        initSkills();
        checkSkills();
    }

    private void checkSkills(){
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] == null) {
                throw new NullPointerException();
            }
        }
    }

    //释放技能
    public void release(int index){
        if (index < 0) {
            index = 0;
        }else if (index > 3) {
            index = 3;
        }
        System.out.println(name + "释放" + skills[index]);
    }

    //物理攻击
    public void commonAttack(){
        System.out.println(name + "进行物理攻击");
    }

    public abstract String getName();

    public abstract void initSkills();

}
