package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/29 13:36
 * @description：线上问题
 * @modified By：
 * @version: $
 */
public class Problem implements Task {
    private Programmer programmer;
    public Problem(Programmer programmer){
        this.programmer = programmer;
    }
    @Override
    public Programmer getProgrammer(){
        return programmer;
    }
    @Override
    public void handle() {
        programmer.handleProblem();
    }
    @Override
    public String toString(){
        return "Problem【Programer="+programmer.getName()+"】";
    }
}
