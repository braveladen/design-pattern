package com.cetc28.designpattern.detail.behaviorType.observer.观察者;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/26 8:49
 * @description：调用类
 * 观察者与被观察者之间的观察关系，有两种建立方式：
 * 1、第一种由外部调用类来建立，外部调用类直接调用被观察者的addObserver方法来建立关联关系
 * 2、第二种由观察者提供调用被观察者addObserver方法的接口，再由外部调用类的调用建立关联关系。
 * 第一种方法，观察者与被观察者代码耦合度低，但外部调用类会有大量冗余代码；
 * 第二种方法，观察者与被观察者代码耦合度高，但外部调用类使用会很方便，建议用第二种方法。
 *
 * @modified By：
 * @version: $
 */
//客户端调用
public class Client {

    public static void main(String[] args) {
        //假设四个读者，两个作者
        Reader r1 = new Reader("张三");
        Reader r2 = new Reader("李四");
        Reader r3 = new Reader("王五");

        Writer w1 = new Writer("天蚕土豆");
        Writer w2 = new Writer("唐家三少");
        Writer w3 = new Writer("耳根");
        Writer w4 = new Writer("辰东");


        r1.subscribe("天蚕土豆");
        r1.subscribe("耳根");
        r2.subscribe("唐家三少");
        r2.subscribe("耳根");
        r2.subscribe("辰东");
        r3.subscribe("天蚕土豆");

        //作者发布新书就会通知关注的读者
        //天蚕土豆写了《斗破苍穹》
        w1.addNovel("斗破苍穹");
        //唐家三少写了《斗罗大陆》
        w2.addNovel("斗罗大陆");
        //耳根写了《仙逆》
        w3.addNovel("仙逆");
        //辰东写了《神墓》
        w4.addNovel("神墓");

        r1.unsubscribe("天蚕土豆");
        //天蚕土豆写了《琴帝》
        w1.addNovel("琴帝");
    }

}
