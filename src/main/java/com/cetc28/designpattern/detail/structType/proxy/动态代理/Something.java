package com.cetc28.designpattern.detail.structType.proxy.动态代理;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 18:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Something implements SomeInterface {
    @Override
    public void write(){
        System.out.println("write something");
    }
}
