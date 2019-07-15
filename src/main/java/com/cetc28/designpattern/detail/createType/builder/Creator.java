package com.cetc28.designpattern.detail.createType.builder;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 18:43
 * @description：制造过程
 * 调用指挥者生成制造的对象。
 * 建造者模式的适用场景为：
 * 1、对象必须是复杂对象，复杂对象就是指属性较多的对象；
 * 2、对象的构建过程存在顺序关系；
 * 3、对象的表示（制造结果）有不同的种类，且需要加以区分。
 * 使用建造者模式以后，就不需要每次制造不同种类的对象时，还把构建过程手写一遍，毕竟手写一遍复杂的制造过程有可能写漏。
 * 建造者模式用来构建一批构建过程相同，但表示不同的对象。
 * @modified By：
 * @version: $
 */
public class Creator {
    public static void main(String[] args) {
        Soul soul = new Soul();
        //制造一个瘦小的看守所的人员
        System.out.println("获得了" + soul.createDoppelganger(new ThinBuilder(),"看守所人员1"));
        System.out.println("----------------------------------------");

        //制造一个胖胖的看守所的人员
        System.out.println("获得了" + soul.createDoppelganger(new FatBuilder(),"看守所人员2"));
    }
}
