package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/29 13:49
 * @description：市场业务人员
 * @modified By：
 * @version: $
 */
public class Salesman {
    private String name;
    private ProductManager productManager;
    public Salesman(String name){
        this.name = name;
    }
    public Salesman(String name,ProductManager productManager){
        this.name = name;
        this.productManager = productManager;
    }
    public void pushProblem(){
        pushTask(new Problem(productManager.chooseProgrammer()));
    }
    public void pushBug(){
        pushTask(new Bug(productManager.chooseProgrammer()));
    }
    public void pushDemand(){
        pushTask(new Demand(productManager.chooseProgrammer()));
    }
    private void pushTask(Task task){
        productManager.receive(task);
    }
}
