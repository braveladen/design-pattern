package com.cetc28.designpattern.detail.behaviorType.state;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/4 14:05
 * @description：跑动状态接口
 * run方法关联Hero类，每一类跑动状态可执行Hero对象的跑动。
 * 状态模式将对象的状态抽象出来：
 * 1、在使用状态模式前，只能在对象内部进行if else逻辑判断当前的对象状态，从而执行相当状态下的操作；
 * 2、在使用状态模式后，将所有状态提取出来，通过多态解决逻辑判断的问题，并使状态可扩展。
 * @modified By：
 * @version: $
 */
public interface RunState {
    void run(Hero hero);
}
class CommonState implements RunState{
    @Override
    public void run(Hero hero) {
        //正常跑动则不打印内容，否则会刷屏
    }

}
class SpeedUpState implements RunState{
    @Override
    public void run(Hero hero) {
        System.out.println("--------------加速跑动---------------");
        try {
            Thread.sleep(4000);//假设加速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------加速状态结束，变为正常状态------");
    }

}
class SpeedDownState implements RunState{
    @Override
    public void run(Hero hero) {
        System.out.println("--------------减速跑动---------------");
        try {
            Thread.sleep(4000);//假设减速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------减速状态结束，变为正常状态------");
    }

}
class SwimState implements RunState{
    @Override
    public void run(Hero hero) {
        System.out.println("--------------不能跑动---------------");
        try {
            Thread.sleep(2000);//假设眩晕持续2秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------眩晕状态结束，变为正常状态------");
    }

}