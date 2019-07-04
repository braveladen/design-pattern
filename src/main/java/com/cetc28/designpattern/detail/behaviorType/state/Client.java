package com.cetc28.designpattern.detail.behaviorType.state;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/4 14:10
 * @description：调用类
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setState(Hero.SPEED_UP);
        hero.startRun();
    }
}
