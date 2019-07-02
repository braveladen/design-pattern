package com.cetc28.designpattern.principle.interfaceIsolation;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 9:51
 * @description：
 * 接口隔离原则是指最小化接口功能，类似于单一职责原则，单一职责是说类的功能单一化，减少代码修改；接口隔离原则是指接口的功能单一化，避免接口功能太多太杂，导致实现接口的时候要实现很多根本用不到的接口。
 * 这里又体现了高内聚，低耦合的思想。
 * 碰上接口里功能的情况，可以按如下两种方式拆分接口：
 * 1、如果功能相关较大，直接拆成两个独立的接口；
 * 2、如果功能有很多重用的地方，可以使用父子接口的方式。
 * @modified By：
 * @version: $
 */
public interface SmartPhoneFunc extends PhoneFunction {
    void webchat();
}
