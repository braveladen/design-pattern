package com.cetc28.designpattern.detail.structType.proxy.动态代理;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 18:55
 * @description：
 * @modified By：
 * @version: $
 */
public class OtherThing implements SomeInterface {
    @Override
    public void write() {
        System.out.println("write otherthing");
    }
}
