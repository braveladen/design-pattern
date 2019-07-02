package com.cetc28.designpattern.principle.liReplace;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 9:35
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class Computer {
    public abstract void play();
    public void open(){
        System.out.println("计算机开机");
    }
    public void close(){
        System.out.println("计算机关机");
    }
}
