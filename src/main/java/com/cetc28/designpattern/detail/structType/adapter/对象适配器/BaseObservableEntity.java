package com.cetc28.designpattern.detail.structType.adapter.对象适配器;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 15:39
 * @description：对象适配器
 * 对象适配器是因为类适配器没法用了，才用对象适配器。如果我们需要适配两个类，由于java是单继承的，所以没法使用类适配器。
 * 为什么我们要适配两个类呢，之前类适配器的需求是把类与接口进行适配，那么对象适配器的需求就是把类与另一个类进行适配。
 * 为了保留原始类的功能，对象适配器肯定是要继承原始类的，那么另一个类怎么适配呢？
 * 对象适配器是把另一个类的对象直接申明在对象适配器类中，然后在对象适配类中，把另一个类对象的方法再实现一遍。
 * @modified By：
 * @version: $
 */

//我们扩展BaseEntity,适配出来一个可观察的实体基类
public class BaseObservableEntity extends BaseEntity{

    private Observable observable = new Observable();

    public synchronized void addObserver(Observer o) {
        observable.addObserver(o);
    }

    public synchronized void deleteObserver(Observer o) {
        observable.deleteObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void notifyObservers(Object arg) {
        observable.notifyObservers(arg);
    }

    public synchronized void deleteObservers() {
        observable.deleteObservers();
    }
    //observable.setChanged()为protected方法，因此BaseObervableEntity需要与Observable在同一个package下。
    //把这个类挪到java.util包下就不报错
    protected synchronized void setChanged() {
        //observable.setChanged();
    }
    //observable.clearChanged()为protected方法，因此BaseObervableEntity需要与Observable在同一个package下。
    protected synchronized void clearChanged() {
        //observable.clearChanged();
    }

    public synchronized boolean hasChanged() {
        return observable.hasChanged();
    }

    public synchronized int countObservers() {
        return observable.countObservers();
    }

}
