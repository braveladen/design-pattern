package com.cetc28.designpattern.detail.behaviorType.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 18:37
 * @description：调用类
 * 职责链模式的作用在于：
 * 1、将调用客户端与服务执行者进行解耦，客户端只认证一个服务执行者的管理类，不再调用服务执行者；
 * 2、服务执行者的内部结构和执行顺序全都封装在服务执行者和它的管理类中，调用客户端不需要关注这些。
 * 职责链模式的使用场景为：
 * 1、请求需要多个同类型对象按某种顺序执行。
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Subbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));

        //注册5个分店
        OrderManager.getOrderManager().registerSubbranch(mcSubbranch1,mcSubbranch2,mcSubbranch3,mcSubbranch4,mcSubbranch5);

        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        print(mcSubbranch1);
        System.out.println("------------------------------------------");

        //小左开始订餐，直接找订餐管理部门订餐
        OrderManager.getOrderManager().handleOrder(new Order(900, 20, order));

        System.out.println("------------------------------------------");
        print(mcSubbranch1);
    }

    public static void print(Subbranch subbranch){
        if (subbranch == null ) {
            return;
        }
        do {
            if (subbranch instanceof McSubbranch) {
                System.out.println("[" + subbranch + "]的菜单:" + ((McSubbranch) subbranch).getMenu());
            }
        } while ((subbranch = ((McSubbranch) subbranch).getNextSubbranch()) != null);
    }
}
