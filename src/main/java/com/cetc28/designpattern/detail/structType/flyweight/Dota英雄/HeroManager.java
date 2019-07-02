package com.cetc28.designpattern.detail.structType.flyweight.Dota英雄;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:18
 * @description：英雄管理类，即英雄池
 * 抽象共享类的管理池，享元模式中一个重要的角色就是这个池，它负责：
 * 1、创建共享元素；
 * 2、返回共享元素；
 * 3、通过HashMap维护一个共享元素的池子。
 * @modified By：
 * @version: $
 */
//提供共享功能，单例
public class HeroManager {

    private static HeroManager heroManager = new HeroManager();

    private Map<String, AbstractHero> heroMap;

    private HeroManager(){
        heroMap = new HashMap<String, AbstractHero>();
    }

    public static HeroManager getInstance(){
        return heroManager;
    }

    //该方法提供共享功能
    public AbstractHero getHero(String name){
        AbstractHero hero = heroMap.get(name);
        if (hero == null) {
            if (name.equals("恶魔巫师")) {
                hero = new Lion();
            }else if (name.equals("影魔")) {
                hero = new SF();
            }
            heroMap.put(name, hero);
        }
        return hero;
    }
}
