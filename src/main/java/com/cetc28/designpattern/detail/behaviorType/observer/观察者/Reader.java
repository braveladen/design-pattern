package com.cetc28.designpattern.detail.behaviorType.observer.观察者;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/26 8:45
 * @description：读者类
 * 观察者需要在实现自有功能的基础上，implements observer接口，实现update方法，并且提供观察被观察者的方法。
 * 如果观察者不能实现Observer接口，原因可能是观察者是第三方提供的jar包中的固定类，那么就没法观察被观察者了，因为Observable的观察者列表必须是Observer接口实现类，这个时候就可以使用适配器模式中的类适配器。
 * @modified By：
 * @version: $
 */
//读者类，要实现观察者接口
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
    public void subscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的观察者列表里删除
    public void unsubscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    //当关注的作者发表新小说时，会通知读者去看
    @Override
    public void update(Observable o, Object obj) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name+"知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
        }
    }

}
