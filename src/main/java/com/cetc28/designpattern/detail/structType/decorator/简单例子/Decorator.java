package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/28 15:33
 * @description：装饰器类
 * 装饰器的实现原理是：
 * 1、通过实现被装饰接口，或者继承被装饰抽象类，来保留被装饰接口或抽象类的方法；
 * 2、通过里氏替换原则，在构造函数中传入被装饰类（被装饰类可以是被装饰接口的实现类或者被装饰抽象类的子类），从而可以装饰这个类，实现并增强这个类的功能。
 * 总结上面两条，其实就是：装饰器能够在保留被装饰类原有功能的基础上，增加完善新的功能。
 * 由于被装饰类可以是被装饰抽象类的子类，也可以是子类的子类，所以可以实现多级的装饰。
 * @modified By：
 * @version: $
 */
public class Decorator  implements Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void method(){
        component.method();
    }
}
