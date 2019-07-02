package com.cetc28.designpattern.detail.createType.factory.抽象工厂;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/25 18:53
 * @description：抽象工厂类
 * 抽象工厂类在工厂方法的基础之上，又支持了一个抽象工厂里可以有多个产品体系。
 * 工厂方法只能支持在抽象工厂里只有一个产品体系；而抽象工厂支持在抽象工厂里有多个产品体系
 * 如果用工厂方法来实现多产品体系的创建，那么会创建好几套工厂方法，代码过于繁多，所以，就可以使用抽象工厂。
 * 但是，使用抽象工厂以后，产品体系就是写死在抽象工厂类中的，如果要变动产品体系，就需要修改代码了
 * 所以，抽象工厂比较适合产品体系稳定的情况。
 *
 * 另外，还需要注意一点，在实际使用抽象工厂时，一般它负责的多个产品体系之间是有关系的，比如继承关系（List抽象工厂可以创建Iterator和Abstract.Itr两类产品体系，Abstract.Itr是Iterator的子类）。
 * 很少会使用抽象工厂模式去创造一批毫无关系的产品。
 * @modified By：
 * @version: $
 */
public class AbstractFactoryUse {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.getProduct();
        factoryA.getProduct1();

        Factory factoryB = new FactoryB();
        factoryB.getProduct();
        factoryB.getProduct1();
    }
}
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//多了一个抽象产品1
interface Product1{}

//具体产品1
class Product1A implements Product1{}
class Product1B implements Product1{}

//原有的工厂方法模式的工厂里添加一个方法
interface Factory{
    Product getProduct();
    //添加另外一个产品族的创造方法
    Product1 getProduct1();
}
//具体的工厂A，创造产品A
class FactoryA implements Factory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
    @Override
    //添加相应的实现
    public Product1 getProduct1() {
        return new Product1A();
    }

}
//具体的工厂B，创造产品B
class FactoryB implements Factory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
    //添加相应的实现
    @Override
    public Product1 getProduct1() {
        return new Product1B();
    }

}
