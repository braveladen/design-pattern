package com.cetc28.designpattern.detail.behaviorType.state;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/4 14:08
 * @description：英雄类
 * 状态模式的使用场景为：
 * 1、控制一个对象状态的条件表达式过于复杂时；
 * 2、对于不同状态执行不同的业务逻辑。
 * 状态模式的好处在于：
 * 1、去掉if else逻辑判断对象状态，代码可维护性变强；
 * 2、使用多态替代if else，代码可扩展性变强；
 * 3、对象的状态为final，可在不同对象间共享，节省内存。
 * 状态模式和策略模式都可以用来解决if else的问题，区别在于：
 * 1、状态模式所有的状态子类中，会把本状态下执行的业务逻辑都给执行了，即状态子类是业务执行类，而策略模式下的策略子类，是算法类，业务逻辑执行还保留在原有类中；
 * 2、状态模式中的状态子类可以自己切换原类的状态，这个有点类似于职责链模式，而策略模式的策略子类是不能切换原类的策略的。
 * @modified By：
 * @version: $
 */
public class Hero {

    public static final RunState COMMON = new CommonState();//正常状态

    public static final RunState SPEED_UP = new SpeedUpState();//加速状态

    public static final RunState SPEED_DOWN = new SpeedDownState();//减速状态

    public static final RunState SWIM = new SwimState();//眩晕状态

    private RunState state = COMMON;//默认是正常状态

    private Thread runThread;//跑动线程

    //设置状态
    public void setState(RunState state) {
        this.state = state;
    }
    //停止跑动
    public void stopRun() {
        if (isRunning()) {runThread.interrupt();}
        System.out.println("--------------停止跑动---------------");
    }
    //开始跑动
    public void startRun() {
        if (isRunning()) {
            return;
        }
        final Hero hero = this;
        runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!runThread.isInterrupted()) {
                    state.run(hero);
                }
            }
        });
        System.out.println("--------------开始跑动---------------");
        runThread.start();
    }

    private boolean isRunning(){
        return runThread != null && !runThread.isInterrupted();
    }

}
