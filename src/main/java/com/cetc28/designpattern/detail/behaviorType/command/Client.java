package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/29 14:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        Programmer programmerA = new Programmer("程序猿A");
        Programmer programmerG = new Programmer("程序猿G");
        ProductManager productManager = new ProductManager(programmerA,programmerG);
        Salesman salesmanA = new Salesman("李四",productManager);
        Salesman salesmanB = new Salesman("张三",productManager);
        Salesman salesmanC = new Salesman("王五",productManager);

        salesmanA.pushBug();
        salesmanA.pushBug();
        salesmanA.pushBug();
        salesmanA.pushDemand();
        salesmanA.pushProblem();
        salesmanB.pushProblem();
        salesmanB.pushBug();
        salesmanB.pushBug();
        salesmanC.pushDemand();
        salesmanC.pushBug();
        salesmanC.pushDemand();

        productManager.printTaskList();
        productManager.assign();
        productManager.printTaskList();
        productManager.assign();
    }
}
