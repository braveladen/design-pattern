package com.cetc28.designpattern.principle.singlePrinciple;

import java.io.IOException;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 9:01
 * @description：
 * 单一职责原则体现了高内聚，低耦合的思路，把不同的功能拆分到不同的类里，从而：
 * 1、增加可复用性，把每一个类的功能做精，以便该类可以被其它类复用；
 * 2、降低代码修改，如果不同功能糅合在一个类里，那么如果需要修改部分功能或者扩充部分功能，这个类就要不停地改。
 * @modified By：
 * @version: $
 */
public class NewCalculator {
    public Integer add(Integer a,Integer b){
        return a+b;
    }
    public Integer multi(Integer a,Integer b){
        return a*b;
    }

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("D:\\cal.txt");
        Integer a = Integer.valueOf(reader.readLine());
        Integer b = Integer.valueOf(reader.readLine());
        NewCalculator calculator = new NewCalculator();
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.multi(a,b));
    }
}
