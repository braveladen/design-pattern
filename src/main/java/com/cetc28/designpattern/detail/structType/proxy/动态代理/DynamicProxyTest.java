package com.cetc28.designpattern.detail.structType.proxy.动态代理;

import java.lang.reflect.Proxy;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 18:39
 * @description：
 * @modified By：
 * @version: $
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        SomeInterface something = new Something();
        SomeInterface otherThing = new OtherThing();
        DynamicProxy dnamicProxy1 = new DynamicProxy(something);
        SomeInterface proxy1 = (SomeInterface)dnamicProxy1.getProxy();
        proxy1.write();
        DynamicProxy dnamicProxy2 = new DynamicProxy(otherThing);
        SomeInterface proxy2 = (SomeInterface)dnamicProxy2.getProxy();
        proxy2.write();
    }
}
