package com.cetc28.designpattern.detail.createType.singleton.饿汉模式;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/24 14:00
 * @description：饿汉模式的单例
 * 缺点是：不能延迟加载
 * @modified By：
 * @version: $
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

}