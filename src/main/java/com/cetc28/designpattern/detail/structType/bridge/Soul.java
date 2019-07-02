package com.cetc28.designpattern.detail.structType.bridge;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 11:12
 * @description：抽象灵魂类
 * 桥接模式应用于实体类有两个或多个维度的变化，如外貌和技能两个维度。
 * 实体类的多维度变化不适合用继承来实现，因为用继承来实现，子类的数量会随着维度的增加而呈倍数递增。
 * 而使用桥接模式，把变化维度抽象成接口或者抽象类，而实体类引入变化维度接口或类。
 * 这样做的好处为：
 * 1、大幅减少子类数量，本例中如果使用继承实现，那有2个子类和6个子子类，而使用桥接模式，那有2个接口和5个接口实现类；
 * 2、变化维度可以不断扩展，桥接的变化接口可以不断有新的变化实现类；
 * 3、变化维度的切换由实体类灵活控制，而不是由客户端调用子类来控制；
 * @modified By：
 * @version: $
 */
public abstract class Soul {

    protected Appearance appearance;//外貌

    protected Skills skills;//技能

    //具体的实现交给实现部分处理
    public void show(){
        appearance.show();
    }
    //具体的实现交给实现部分处理
    public void releaseSkills(){
        skills.releaseSkills();
    }

    public void createDoppelganger(){
        System.out.println("制作分身");
    }
    //抽象的方法，留给分身实现
    public abstract void doAllLikePeople();

    public Soul() {
        super();
    }

    public Soul(Skills skills) {
        super();
        this.skills = skills;
    }

    public Soul(Appearance appearance) {
        super();
        this.appearance = appearance;
    }

    public Soul(Appearance appearance, Skills skills) {
        super();
        this.appearance = appearance;
        this.skills = skills;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

}