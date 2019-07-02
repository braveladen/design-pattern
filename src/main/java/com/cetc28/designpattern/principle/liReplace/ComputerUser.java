package com.cetc28.designpattern.principle.liReplace;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 9:51
 * @description：
 * 里氏替换原则是指子类可以替换父类进行工作，也即我们在给其它服务用的时候，直接提供父类的接口方法，但是是实际使用时，可以使用子类的方法。
 * 子类替换父类体现了面向抽象类编程的思想，即父类使用抽象类，子类为实例化的类。
 * 子类替换父类需要遵循如下原则：
 * 1、子类可以override父类的抽象方法，但是不能overload父类的非抽象方法；
 * 2、子类可以实现自己的方法；
 * 3、当子类override父类的抽象方法时，方法参数要比父类抽象方法更为宽松；（参数放大）
 * 4、当子类override父类的抽象方法时，返回值的类型要比父类抽象方法更为严格；（返回值缩小）
 * 5、当子类override父类的抽象方法时，抛出的异常要比父类更为严格。（异常缩小）
 * @modified By：
 * @version: $
 */
public class ComputerUser {
    private Computer computer;
    public ComputerUser(Computer computer){
        this.computer = computer;
    }
    public void computerProcess(){
        computer.open();
        computer.play();
        computer.close();
    }

    public static void main(String[] args) {
        ComputerUser computerUser1 = new ComputerUser(new DesktopComputer());
        ComputerUser computerUser2 = new ComputerUser(new NotebookComputer());
        computerUser1.computerProcess();
        computerUser2.computerProcess();
    }
}
