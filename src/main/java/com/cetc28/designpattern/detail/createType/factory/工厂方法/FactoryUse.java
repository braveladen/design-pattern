package com.cetc28.designpattern.detail.createType.factory.工厂方法;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/25 8:52
 * @description：抽象工厂及产品使用类
 * 在使用抽象工厂生成产品时，注意声明为接口类型，以便扩展。
 * @modified By：
 * @version: $
 */
public class FactoryUse {
    public static void main(String[] args) {
        BirdFactory maQueCreator = new MaQueCreator();
        BirdInterface maQueCreatorBird = maQueCreator.createBird();
        maQueCreatorBird.fly();

        BirdFactory yanZiCreator = new YanZiCreator();
        BirdInterface yanZiCreatorBird = yanZiCreator.createBird();
        yanZiCreatorBird.fly();
    }
}
