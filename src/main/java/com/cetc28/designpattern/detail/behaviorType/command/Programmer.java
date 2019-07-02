package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/29 13:30
 * @description：程序猿
 * @modified By：
 * @version: $
 */
public class Programmer {
    private String name;
    public Programmer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void handleDemand(){
        System.out.println(name+"处理新需求");
    }
    public void handleBug(){
        System.out.println(name+"处理BUG");
    }
    public void handleProblem(){
        System.out.println(name+"处理线上问题");
    }
}
