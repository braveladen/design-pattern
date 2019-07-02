package com.cetc28.designpattern.detail.behaviorType.observer.事件驱动;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/26 9:06
 * @description：作者事件
 * 作者事件继承自EventObject事件类，事件类最主要的特点就是通过构造函数传入了事件源writer，这样事件监听器就可以通过事件类获取事件源对象，然后就可以执行事件源对象的某些方法了。
 * @modified By：
 * @version: $
 */
import java.util.EventObject;

public class WriterEvent extends EventObject{

    private static final long serialVersionUID = 8546459078247503692L;

    public WriterEvent(Writer writer) {
        super(writer);
    }

    public Writer getWriter(){
        return (Writer) super.getSource();
    }

}