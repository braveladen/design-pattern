package com.cetc28.designpattern.detail.structType.decorator.简单例子;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/28 15:32
 * @description：
 * @modified By：
 * @version: $
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("我是原始类，我在打字！！！");
    }
}
