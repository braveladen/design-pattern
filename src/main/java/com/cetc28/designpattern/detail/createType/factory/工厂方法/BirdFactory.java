package com.cetc28.designpattern.detail.createType.factory.工厂方法;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 14:03
 * @description：抽象工厂接口
 * 相比于简单工厂，将产品的创建类也进行了抽象，抽象成了接口，然后针对每一个产品实现类提供了单独的创建类
 * 这样，如果新增产品，不需要修改产品创建类，只需要加一个新的产品创建类即可。
 * @modified By：
 * @version: $
 */
public interface BirdFactory {
    BirdInterface createBird();
}
