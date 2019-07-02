package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/28 15:32
 * @description：被装饰接口
 * 装饰者模式的灵活点在于：
 * 1、被装饰的可以是接口，也可以是抽象类
 * 2、Decorator这个装饰者的抽象类可以不要，具体的装饰类直接装饰被装饰者也可以。
 * 此处被装饰的是接口，被装饰类是实现这个接口的类。同理，装饰器要么也实现这个接口；要么继承这个接口的实现类。
 * 如果被装饰的是抽象类，被装饰类是继承这个抽象类的类。同理，装饰器继承这个抽象类，或者这个抽象类的子类。
 * @modified By：
 * @version: $
 */
public interface Component {
    void method();
}
