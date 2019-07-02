package com.cetc28.designpattern.detail.behaviorType.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 9:38
 * @description：没用迭代器的实现类
 * 在不使用迭代器的情况下，我们遍历集合的方式为：先把集合转为数组，然后对数组进行遍历。
 * 这种方式最大的缺点就是：集合转数组的时候也要遍历一次集合；数组遍历的时候又要遍历一次，所以其实是遍历了两次。
 * 为了解决这个问题，使用迭代器模式，在集合内部定义迭代器内部类，迭代器内部类中对外提供遍历集合的方法，对内使用集合的属性和方法进行遍历。
 * @modified By：
 * @version: $
 */
public class NoIteratorImpl {
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
        Object[] arrayListArray = arrayList.toArray();
        for(int i=0;i<arrayListArray.length;i++){
            System.out.println(arrayListArray[i]);
        }
        Object[] linkedListArray = linkedList.toArray();
        for(int i=0;i<linkedListArray.length;i++){
            System.out.println(linkedListArray[i]);
        }
        Object[] hashSetArray = hashSet.toArray();
        for(int i=0;i<hashSetArray.length;i++){
            System.out.println(hashSetArray[i]);
        }
    }
}
