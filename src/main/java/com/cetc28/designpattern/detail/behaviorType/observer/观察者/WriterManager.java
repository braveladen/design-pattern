package com.cetc28.designpattern.detail.behaviorType.observer.观察者;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 8:47
 * @description：作者管理类
 * 作者管理类的作用是保证每一个作者实例的唯一性
 * 读者在关注作者的时候，是观察一个作者实例，我们需要保证所有读者观察的是同一个作者实例，而不是很次都new一个新的作者来观察。
 *
 * 观察者模式适用于：发布（release）--订阅（subscibe），变化（change）--更新（update）
 * @modified By：
 * @version: $
 */
import java.util.HashMap;
import java.util.Map;

//管理器，保持一份独有的作者列表
public class WriterManager{

    private Map<String, Writer> writerMap = new HashMap<String, Writer>();

    //添加作者
    public void add(Writer writer){
        writerMap.put(writer.getName(), writer);
    }
    //根据作者姓名获取作者
    public Writer getWriter(String name){
        return writerMap.get(name);
    }

    //单例
    private WriterManager(){}

    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }
    private static class WriterManagerInstance{

        private static WriterManager instance = new WriterManager();

    }
}
