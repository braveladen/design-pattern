package com.cetc28.designpattern.detail.behaviorType.observer.事件驱动;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 9:10
 * @description：作者管理类
 * 事件驱动模型适用于：请求（request）--响应（response），事件发生（occur）--事件处理（handle）
 * @modified By：
 * @version: $
 */
public class WriterManager {
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
