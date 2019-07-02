package com.cetc28.designpattern.detail.createType.singleton.枚举;

import java.io.Serializable;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 14:03
 * @description：枚举单例
 * 有专家说过，枚举单例是实现单例模式的最佳方式，原因如下：
 * 1、代码极为简洁；
 * 2、如果该对象需要序列化，即 implements Serializable，那么只有使用枚举单例，才能保证单例对象实例化的结果都是一样的；
 * 3、避免反射攻击，只有枚举单例可以避免通过反射的方式创建对象，其它的方式都可以走反射来创建新对象。
 * @modified By：
 * @version: $
 */
public enum Singleton {
    INSTANCE;
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Singleton getInstance(){
        return INSTANCE;
    }
}
