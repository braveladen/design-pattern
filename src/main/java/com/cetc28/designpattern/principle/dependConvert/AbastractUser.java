package com.cetc28.designpattern.principle.dependConvert;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 11:20
 * @description：
 * 采用面向抽象类编程的思想，来保证依赖倒置原则。
 * 类的使用者根据抽象类的方法，来进行编程，究其原因，是因为：
 * 抽象类是稳定的，它的方法只有一个方法名，代表了一个功能；
 * 而子类的方法是不稳定的，是可变的。
 * 所以，我们才向类的使用者屏蔽抽象类的实现细节，类的使用者只需要知道某个方法能够实现XX功能即可。
 * @modified By：
 * @version: $
 */
public class AbastractUser {
    ParentAbstract parentAbstract;
    public AbastractUser(ParentAbstract parentAbstract){
        this.parentAbstract = parentAbstract;
    }
    public void operateFile(){
        parentAbstract.read();
        parentAbstract.write();
    }
}
