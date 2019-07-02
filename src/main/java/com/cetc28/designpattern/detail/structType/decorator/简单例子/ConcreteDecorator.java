package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/28 15:35
 * @description：
 * @modified By：
 * @version: $
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }
    @Override
    public void method() {
        System.out.println("我是装饰器A，我开始了！！！");
        super.method();
        System.out.println("我是装饰器A，我结束了！！！");
    }

}
