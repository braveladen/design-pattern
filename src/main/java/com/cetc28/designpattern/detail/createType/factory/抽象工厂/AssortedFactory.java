package com.cetc28.designpattern.detail.createType.factory.抽象工厂;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/25 19:00
 * @description：将自己的工厂方法，与第三方jar包中的工厂方法进行整合
 * 第三方jar包中的工厂方法是不能改动的，如果我们需要对第三方Jar包的工厂方法进行扩展：
 * 1、首先，需要再扩展一个自己的工厂方法；
 * 2、其次，再抽象出一个抽象工厂，用来创建自己的工厂方法和三方Jar包的工厂方法。
 * 对第三方jar包产品的创建和自己工厂的产品创建，都由这个抽象工厂来负责。
 * @modified By：
 * @version: $
 */

/*  到这里是我们自己的一套工厂方法模式，去创造我们自己的产品，以下我们将以上二者组合   */
//我们使用组合的方式将我们的产品系列和jar包中的产品组合起来
public class AssortedFactory {
    MyFuctory myFactory;
    Factory factory;

    public AssortedFactory(MyFuctory myFactory, Factory factory) {
        super();
        this.myFactory = myFactory;
        this.factory = factory;
    }

    public Product getProduct() {
        return factory.getProduct();
    }

    public MyPraduct getMyProduct() {
        return myFactory.getMyPraduct();
    }
}




//抽象产品
interface Praduct{}

//具体产品
class PraductA implements Praduct{}
class PraductB implements Praduct{}

//工厂接口
interface Fuctory{
    Praduct getPraduct();
}

//具体的工厂A，创造产品A
class FuctoryA implements Fuctory{
    @Override
    public Praduct getPraduct() {
        return new PraductA();
    }

}
//具体的工厂B，创造产品B
class FuctoryB implements Fuctory{
    @Override
    public Praduct getPraduct() {
        return new PraductB();
    }

}

/*   假设以上是一个第三方jar包中的工厂方法模式，我们无法改动源码   */

//我们自己特有的产品
interface MyPraduct{}

//我们自己特有的产品实现
class MyPraductA implements MyPraduct{}
class MyPraductB implements MyPraduct{}

//我们自己的工厂接口
interface MyFuctory{
    MyPraduct getMyPraduct();
}

//我们自己特有的工厂A，产生产品A
class MyFuctoryA implements MyFuctory{
    @Override
    public MyPraduct getMyPraduct() {
        return new MyPraductA();
    }

}

//我们自己特有的工厂B，产生产品B
class MyFuctoryB implements MyFuctory{
    @Override
    public MyPraduct getMyPraduct() {
        return new MyPraductB();
    }

}