package com.cetc28.designpattern.detail.structType.flyweight.钢笔取墨水;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:49
 * @description：调用类
 * 享元模式的注意事项：后一次复用某个对象时，前一次的创建出来的 一定不能再次使用，否则必然会导致数据错乱问题。(用后即焚)
 * 多线程中去使用的话，同时复用一个对象的时候，修改的话很容易产生线程安全的问题，这个就需要对操作都设计成原子性或者类似生命周期的设定，严格禁止同时获取一个对象进行相关操作
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        PenFlyWeight flyWeight = FlyweightFactory.getFlyWeight("钢笔");
        flyWeight.setColor("黑色墨水");
        System.out.println(flyWeight.toString());

        PenFlyWeight flyWeight2 = FlyweightFactory.getFlyWeight("钢笔");
        flyWeight2.setColor("红色墨水");
        System.out.println(flyWeight2.toString());
        //此时打印输出flyweight1，可以看到flyweight的颜色变成了红色墨水
        //所以需要注意的是在使用flyWeight2后，一定不能再次使用flyweigt1，否则会出现数据错乱的问题
        System.out.println(flyWeight.toString());

        PenFlyWeight flyWeight3 = FlyweightFactory.getFlyWeight("毛笔");
        flyWeight3.setColor("黄色颜料");
        System.out.println(flyWeight3.toString());

    }
}
