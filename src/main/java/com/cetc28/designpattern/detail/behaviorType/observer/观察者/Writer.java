package com.cetc28.designpattern.detail.behaviorType.observer.观察者;

import java.util.Observable;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 8:46
 * @description：作者类
 * 被观察者需要在实现自有功能的基础上，继承Observable类，并在某些时刻调用setChanged()方法，改变被观察者状态；再调用notifyObservers()方法，通知观察者。
 * 如果被观察者已经有父类了，那它就无法继承Observable类，此时有两种解决办法：
 * 1、不继承Observable,把Observable的代码直接搬出来，写在被观察者里面；
 * 2、使用适配器模式中的对象适配器。
 * @modified By：
 * @version: $
 */
//作者类，要继承自被观察者类
public class Writer extends Observable {

    private String name;//作者的名称

    private String lastNovel;//记录作者最新发布的小说

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public String getName() {
        return name;
    }

}
