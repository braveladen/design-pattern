package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/28 15:40
 * @description：
 * @modified By：
 * @version: $
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component concreteDecorator = new ConcreteDecorator(component);
//        concreteDecorator.method();

        Component concreteConcreteDecorator = new ConcreteConcreteDecorator(concreteDecorator);
        concreteConcreteDecorator.method();
    }
}
