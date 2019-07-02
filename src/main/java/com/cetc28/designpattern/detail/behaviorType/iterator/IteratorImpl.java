package com.cetc28.designpattern.detail.behaviorType.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 9:48
 * @description：用迭代器的实现类
 * 下面就是使用迭代器的实现类，使用迭代器不会再遍历两遍了，原因是因为本身迭代器就用集合的内部类，它在遍历的时候就是用集合内部的属性和方法实现的。
 * 这里需要注意的是：虽然迭代器是Iterator,遍历的时候是Iterator.next()，但是，JDK的foreach已经封装了Iterator，所以foreach写法和Iterator是一个意思。
 * @version: $
 */
public class IteratorImpl {
    public static void main(String[] args) {
        //创建三种类型的集合，分别是ArrayList,LinkedList,HashSet
        ArrayList arrayList = new ArrayList<>();
        for(int i=0;i<12;i++){
            arrayList.add(i);
        }
        LinkedList linkedList = new LinkedList();
        for(int i=0;i<12;i++){
            linkedList.add(i);
        }
        HashSet hashSet = new HashSet();
        for(int i=0;i<12;i++){
            hashSet.add(i);
        }
        //先转成数组，然后遍历
        for(Object object:arrayList){
            System.out.println(object);
        }
        for(Object object:linkedList){
            System.out.println(object);
        }
        for(Object object:hashSet){
            System.out.println(object);
        }
    }
}
