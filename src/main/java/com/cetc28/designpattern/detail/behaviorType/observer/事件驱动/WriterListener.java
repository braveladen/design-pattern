package com.cetc28.designpattern.detail.behaviorType.observer.事件驱动;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/26 9:07
 * @description：作者监听器
 * 作者监听器继承自EventListener，EventListener是所有事件监听器的父类，它是一个标识类，没有方法，只是代表这是一个事件监听器。
 * 固定的监听器用于监听固定的事件，是一一对应的，这也导致了事件驱动模型有个问题就是：
 * 针对每一个事件源都要写对应的事件和监听器，一旦监听事件过多的话，可能会发生类爆炸。
 *
 * 事件驱动的监听器类似于观察者模式中的观察者，不同的是：
 * 1、观察者observer只能有一个update执行方法，而监听器可以有多个监听方法。究极原因是，observer的update方法是写死在JDK里的，而监听器的监听方法是自己写的。
 * @modified By：ob
 * @version: $
 */
import java.util.EventListener;

public interface WriterListener extends EventListener{

    void addNovel(WriterEvent writerEvent);

}