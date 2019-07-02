package com.cetc28.designpattern.detail.behaviorType.observer.事件驱动;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 9:07
 * @description：作者类
 * 作者类是事件的产生者，也被监听器监听的对象，当作者类产生一个事件以后，通知监听器执行相关操作。
 * 不同于观察者模块中，被观察者在变动状态后，通过父类的notifyObservers()方法来调用观察者的update()方法；
 * 事件驱动模型下，事件源是在变动状态后，手动调用事件监听器定义的监听执行方法。
 * 相当于，观察者模式下，状态通知是Observable已经封装好的；而在事件驱动模型下，状态通知是要自己手动代码实现的。
 * @modified By：
 * @version: $
 */
import java.util.HashSet;
import java.util.Set;

//作者类
public class Writer{

    private String name;//作者的名称

    private String lastNovel;//记录作者最新发布的小说

    private Set<WriterListener> writerListenerList = new HashSet<WriterListener>();//作者类要包含一个自己监听器的列表

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        fireEvent();
    }
    //触发发布新书的事件，通知所有监听这件事的监听器
    private void fireEvent(){
        WriterEvent writerEvent = new WriterEvent(this);
        for (WriterListener writerListener : writerListenerList) {
            writerListener.addNovel(writerEvent);
        }
    }
    //提供给外部注册成为自己的监听器的方法
    public void registerListener(WriterListener writerListener){
        writerListenerList.add(writerListener);
    }
    //提供给外部注销的方法
    public void unregisterListener(WriterListener writerListener){
        writerListenerList.remove(writerListener);
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public String getName() {
        return name;
    }

}