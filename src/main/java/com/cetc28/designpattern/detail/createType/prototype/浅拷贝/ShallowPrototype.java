package com.cetc28.designpattern.detail.createType.prototype.浅拷贝;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/4 19:48
 * @description：浅拷贝类
 * 实现Cloneable后，重写的clone方法，就是创建当前对象的一份原型拷贝。
 * 原型模式适用于如下场景：
 * 1、对象的创建非常复杂；
 * 2、在运行过程中需要创建一个同类型对象。
 * 原型模式是浅拷贝，即当前类内部的对象，不会进行拷贝。
 * @modified By：
 * @version: $
 */
public class ShallowPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private Field field;

    public ShallowPrototype() {
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
    public ShallowPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (ShallowPrototype) object;
    }
    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {
        ShallowPrototype prototype1 = new ShallowPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        ShallowPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getField());
    }

}
class Field{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
