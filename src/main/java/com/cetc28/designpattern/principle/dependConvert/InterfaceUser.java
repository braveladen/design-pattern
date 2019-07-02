package com.cetc28.designpattern.principle.dependConvert;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/24 11:26
 * @description：
 * 依赖倒置原则不仅有抽象类一种实现方法，还有接口类的实现方法，也即面向接口编程。
 * 同理，接口是稳定的，而接口的实现类千变万化，对接口的使用者来说，只需要知道自己使用了接口的功能即可，不关注实现细节，所以通过面向接口编程屏蔽实现细节。
 * @modified By：
 * @version: $
 */
public class InterfaceUser {
    InterfaceClass interfaceClass;
    public InterfaceUser(InterfaceClass interfaceClass){
        this.interfaceClass = interfaceClass;
    }
    public void operateFile(){
        interfaceClass.read();
        interfaceClass.write();
    }
}
