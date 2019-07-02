package com.cetc28.designpattern.detail.createType.singleton.双重校验锁;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 14:03
 * @description：双重校验锁单例
 * 通过volatile禁止指令重排，通过synchronized确保线程安全
 * @modified By：
 * @version: $
 */
public class Singleton {

    //一个静态的实例
    private volatile static Singleton synchronizedSingleton;
    //私有化构造函数
    private Singleton(){}
    //给出一个公共的静态方法返回一个单一实例
    public static Singleton getInstance(){
        if (synchronizedSingleton == null) {
            synchronized (Singleton.class) {
                if (synchronizedSingleton == null) {
                    synchronizedSingleton = new Singleton();
                }
            }
        }
        return synchronizedSingleton;
    }
}