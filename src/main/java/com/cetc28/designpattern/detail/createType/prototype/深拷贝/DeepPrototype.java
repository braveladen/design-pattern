package com.cetc28.designpattern.detail.createType.prototype.深拷贝;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/4 19:53
 * @description：深拷贝类
 * 要想实现深拷贝，则需要对象内部的引用对象类，也实现Cloneable接口，并重写clone方法，并在深拷贝类的clone方法中，调用引用对象的clone方法，拷贝该对象的原型。
 * 原型模式的好处在于：
 * 1、原型模式是直接拷贝内存的，速度比new对象要快（原型模式不会执行构造函数）；
 * 2、可运行时创建原型。
 * 原型模式的缺点在于支持深拷贝很不方便，需要额外代码。
 * @modified By：
 * @version: $
 */
public class DeepPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private Field field;

    public DeepPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field = new Field();
        this.field.setA(5);
    }

    public Field getField() {
        return field;
    }
    @Override
    protected DeepPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
            ((DeepPrototype)object).field = this.field.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (DeepPrototype) object;
    }
    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {
        DeepPrototype prototype1 = new DeepPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        DeepPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getField());
    }

}
class Field implements Cloneable{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    @Override
    protected Field clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (Field) object;
    }

}
