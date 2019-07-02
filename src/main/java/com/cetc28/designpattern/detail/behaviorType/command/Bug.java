package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/29 13:37
 * @description：BUG
 * @modified By：
 * @version: $
 */
public class Bug implements Task {
    private Programmer programmer;
    public Bug(Programmer programmer){
        this.programmer = programmer;
    }
    @Override
    public Programmer getProgrammer(){
        return programmer;
    }
    @Override
    public void handle() {
        programmer.handleBug();
    }
    @Override
    public String toString(){
        return "Bug【Programer="+programmer.getName()+"】";
    }
}
