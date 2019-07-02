package com.cetc28.designpattern.detail.structType.flyweight.钢笔取墨水;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:46
 * @description：抽象共享类的子类
 * @modified By：
 * @version: $
 */
public class ConcretePenFlyweight extends PenFlyWeight{
    public ConcretePenFlyweight(String type){
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("写字");
    }
}
