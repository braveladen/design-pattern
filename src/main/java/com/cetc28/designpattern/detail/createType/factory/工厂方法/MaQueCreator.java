package com.cetc28.designpattern.detail.createType.factory.工厂方法;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/25 8:49
 * @description：
 * @modified By：
 * @version: $
 */
public class MaQueCreator implements BirdFactory {
    @Override
    public BirdInterface createBird() {
        return new MaQue();
    }
}
