package com.cetc28.designpattern.detail.structType.flyweight.钢笔取墨水;

import java.util.HashMap;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:48
 * @description：抽象共享类的池类
 * @modified By：
 * @version: $
 */
public class FlyweightFactory {
    private static HashMap<String, PenFlyWeight> poolHashMap = new HashMap<String, PenFlyWeight>();
    public static PenFlyWeight getFlyWeight(String key){
        PenFlyWeight mFlyWeight = null;
        if (!poolHashMap.containsKey(key)) {
            mFlyWeight = new ConcretePenFlyweight(key);
            poolHashMap.put(key, mFlyWeight);
            System.out.println("创建新的对象");
        }else {
            mFlyWeight = poolHashMap.get(key);
            System.out.println("重复利用了");
        }
        return mFlyWeight;
    }
}
