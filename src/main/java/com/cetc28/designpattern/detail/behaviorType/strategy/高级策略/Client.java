package com.cetc28.designpattern.detail.behaviorType.strategy.高级策略;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/26 16:35
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        CalPriceFactory calPriceFactory = CalPriceFactory.getInstance();
        Customer customer = new Customer();
        customer.buy(500.0);
        CalPrice calPrice = calPriceFactory.createCalPrice(customer);
        System.out.println("本次消费金额为"+customer.getAmount()+"，折扣后付："+customer.calLastAmount());
        customer.buy(600.0);
        CalPrice calPrice1 = calPriceFactory.createCalPrice(customer);
        System.out.println("本次消费金额为"+customer.getAmount()+"，折扣后付："+customer.calLastAmount());
        customer.buy(1400.0);
        CalPrice calPrice2 = calPriceFactory.createCalPrice(customer);
        System.out.println("本次消费金额为"+customer.getAmount()+"，折扣后付："+customer.calLastAmount());
    }
}
