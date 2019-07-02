package com.cetc28.designpattern.detail.structType.facade;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/28 16:44
 * @description：外观模式类
 * 外观模式是把一个子系统或者子模块中的功能，通过一个外观模式类进行整合后，再对外提供给用户或其它系统使用。
 * 外观模式最大的作用是系统与系统之间、模块与模块、层与层之间的解耦，避免模块与模块之间大量接口调用所导致的深度耦合。
 * 外观模式中方法包括如下几类：
 * 1、对子系统功能或方法的组合，提供新方法给用户调用；
 * 2、直接调用子系统的某个方法，提供新方法给用户调用。
 * 根据外观模式解耦的规模，外观模式类可以是一个，也可以是多个，例如：
 * 1、如果需要对一个模块进行外观封装，那么只要一个外观模式类即可；
 * 2、如果需要对某一层（比如DAO层）进行外观封装，那么需要多个外观模式类，形成一个外观模式层（比如Service层）。
 * @modified By：
 * @version: $
 */
public class FacadeImpl implements Facade {
    private Sub1 sub1;

    private Sub2 sub2;

    private Sub3 sub3;

    public FacadeImpl() {
        super();
        this.sub1 = new Sub1Impl();
        this.sub2 = new Sub2Impl();
        this.sub3 = new Sub3Impl();
    }

    public FacadeImpl(Sub1 sub1, Sub2 sub2, Sub3 sub3) {
        super();
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public void function12() {
        sub1.function1();
        sub2.function2();
    }
    @Override
    public void function23() {
        sub2.function2();
        sub3.function3();
    }
    @Override
    public void function123() {
        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
