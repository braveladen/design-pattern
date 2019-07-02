package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/29 13:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Demand implements Task {
    private Programmer programmer;
    public Demand(Programmer programmer){
        super();
        this.programmer = programmer;
    }
    @Override
    public Programmer getProgrammer(){
        return programmer;
    }
    @Override
    public void handle() {
        programmer.handleDemand();
    }
    @Override
    public String toString(){
        return "Demand【Programer="+programmer.getName()+"】";
    }
}
