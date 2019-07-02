package com.cetc28.designpattern.detail.createType.factory.工厂方法;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/25 8:48
 * @description：
 * @modified By：
 * @version: $
 */
public class YanZi implements BirdInterface {
    @Override
    public void fly() {
        System.out.println("我是燕子，我会飞");
    }
}
