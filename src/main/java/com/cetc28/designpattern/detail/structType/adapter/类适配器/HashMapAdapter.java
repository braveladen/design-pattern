package com.cetc28.designpattern.detail.structType.adapter.类适配器;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 15:02
 * @description：类适配器
 * 为解决代码无法改的类不能作为观察者，采用类适配器，适配该类与Observer接口，类适配器有该类的所有属性和方法，又实现了Observer接口，可以作为观察者。
 * 类适配器的适用场景是：适配类与接口，即把类适配成某个接口的形式。
 * 它采用的方式就是继承，也即通过继承原始类，保留原始类的功能，又实现原始接口，匹配为接口类型，这样该适配器类就即有原始类功能，又能以原始接口的形式对外暴露服务。
 * @modified By：
 * @version: $
 */
public class HashMapAdapter<K,V> extends HashMap<K,V> implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是hashmap，我也要成为观察者！！！");
    }
}
