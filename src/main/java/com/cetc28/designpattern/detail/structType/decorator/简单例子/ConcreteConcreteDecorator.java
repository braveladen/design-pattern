package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/28 15:38
 * @description：
 * @modified By：
 * @version: $
 */
public class ConcreteConcreteDecorator extends ConcreteDecorator {
    public ConcreteConcreteDecorator(Component component){
        super(component);
    }
    @Override
    public void method() {
        System.out.println("我是装饰器B，我开始了！！！");
        super.method();
        System.out.println("我是装饰器B，我结束了！！！");
    }
}
