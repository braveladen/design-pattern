package com.cetc28.designpattern.detail.behaviorType.chainOfResponsibility;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 18:36
 * @description：麦当劳订单管理类
 * 订餐管理部门，它并不是职责链模式中的角色
 * 但是在职责链模式中，通常情况下会有一个类专门负责维护职责链，它的功能包括：
 * 1、建立职责链之间的执行顺序；
 * 2、将请求发给职责链头部节点，以免请求调用者还需要将请求发送给第一个请求执行者。
 * @modified By：
 * @version: $
 */


public class OrderManager {

    private static OrderManager orderManager = new OrderManager();

    private Subbranch head;

    private Subbranch last;

    private OrderManager(){}

    public static OrderManager getOrderManager(){
        return orderManager;
    }

    //注册分店
    public void registerSubbranch(Subbranch... subbranchs){
        for (Subbranch subbranch : subbranchs) {
            registerSubbranch(subbranch);
        }
    }
    public void registerSubbranch(Subbranch subbranch){
        if (head == null) {
            last = head = subbranch;
        }else {
            last.setSuccessor(subbranch);
            last = subbranch;
        }
    }

    public boolean handleOrder(Order order){
        return head.handleOrder(order);
    }

}
