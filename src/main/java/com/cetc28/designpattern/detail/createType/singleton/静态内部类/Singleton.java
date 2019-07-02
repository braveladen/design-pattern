package com.cetc28.designpattern.detail.createType.singleton.静态内部类;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/24 14:02
 * @description：静态内部类单例
 * 最简单、合理的方式
 * @modified By：
 * @version: $
 */
public class Singleton {

    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{

        static Singleton instance = new Singleton();

    }
}
