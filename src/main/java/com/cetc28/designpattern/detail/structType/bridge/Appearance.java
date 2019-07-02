package com.cetc28.designpattern.detail.structType.bridge;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/1 11:11
 * @description：外貌接口
 * @modified By：
 * @version: $
 */
public interface Appearance {
    void show();
}
//屌丝外形
class Loser implements Appearance{
    @Override
    public void show() {
        System.out.println("展示屌丝形象");
    }

}
//高富帅外形
class TRH implements Appearance{
    @Override
    public void show() {
        System.out.println("展示高富帅形象");
    }

}