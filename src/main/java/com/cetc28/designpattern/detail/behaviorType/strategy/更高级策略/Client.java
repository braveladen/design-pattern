package com.cetc28.designpattern.detail.behaviorType.strategy.更高级策略;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/27 14:02
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy(500D);
        System.out.println("客户本次消费500元，需要付钱：" + customer.calLastAmount());
        customer.buy(1200D);
        System.out.println("客户本次消费1200元，需要付钱：" + customer.calLastAmount());
        customer.buy(1200D);
        System.out.println("客户本次消费1200元，需要付钱：" + customer.calLastAmount());
        customer.buy(1200D);
        System.out.println("客户本次消费1200元，需要付钱：" + customer.calLastAmount());
        customer.buy(2600D);
        System.out.println("客户本次消费2600元，需要付钱：" + customer.calLastAmount());
    }
}
