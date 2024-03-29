package com.cetc28.designpattern.detail.behaviorType.observer.事件驱动;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 9:07
 * @description：读者类
 * 读者类是真正的事件监听器，它获取事件后，
 * @modified By：
 * @version: $
 */
public class Reader implements WriterListener{

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的监听器列表里
    public void subscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).registerListener(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的监听器列表里注销
    public void unsubscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).unregisterListener(this);
    }

    @Override
    public void addNovel(WriterEvent writerEvent) {
        Writer writer = writerEvent.getWriter();
        System.out.println(name+"知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
    }

}
