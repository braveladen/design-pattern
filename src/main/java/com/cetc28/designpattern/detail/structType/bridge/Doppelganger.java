package com.cetc28.designpattern.detail.structType.bridge;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 11:13
 * @description：分身类
 * @modified By：
 * @version: $
 */
public class Doppelganger extends Soul{

    public Doppelganger(){
        System.out.println("制作一个暂无外貌和技能的分身");
    }
    @Override
    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

}
