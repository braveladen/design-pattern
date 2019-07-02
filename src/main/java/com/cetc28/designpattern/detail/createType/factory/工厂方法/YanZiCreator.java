package com.cetc28.designpattern.detail.createType.factory.工厂方法;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/25 8:51
 * @description：
 * @modified By：
 * @version: $
 */
public class YanZiCreator implements BirdFactory {
    @Override
    public BirdInterface createBird() {
        return new YanZi();
    }
}
