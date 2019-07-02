package com.cetc28.designpattern.detail.behaviorType.chainOfResponsibility;

import java.util.Map;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 18:33
 * @description：麦当劳订单类，封装一次订单申请
 * 请求发起者与请求执行者通过订单类交互。
 * @modified By：
 * @version: $
 */
public class Order {

    private int x;
    private int y;
    private Map<String, Integer> order;

    public Order(int x, int y, Map<String, Integer> order) {
        super();
        this.x = x;
        this.y = y;
        this.order = order;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<String, Integer> order) {
        this.order = order;
    }

}
