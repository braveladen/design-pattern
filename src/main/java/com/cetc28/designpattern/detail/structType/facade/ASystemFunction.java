package com.cetc28.designpattern.detail.structType.facade;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/28 16:45
 * @description：
 * @modified By：
 * @version: $
 */
public class ASystemFunction {
}
interface Sub1{
    void function1();
}
interface Sub2{
    void function2();
}
interface Sub3{
    void function3();
}
class Sub1Impl implements Sub1{
    @Override
    public void function1() {
        System.out.println("子系统中Sub1接口的功能");
    }
}
class Sub2Impl implements Sub2{
    @Override
    public void function2() {
        System.out.println("子系统中Sub2接口的功能");
    }
}
class Sub3Impl implements Sub3{
    @Override
    public void function3() {
        System.out.println("子系统中Sub3接口的功能");
    }
}