package com.cetc28.designpattern.detail.structType.adapter.缺省适配器;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 14:50
 * @description：适配器最终提供的类，它继承缺省适配器，override需要使用的方法，其它的方法不使用。
 * 使用缺省适配器的原因在于：
 * 虽然接口最小原则规定了接口中的方法不能太多，要内聚。但是，我们在实现接口时，不同的实现类很有可能只使用接口的部分方法，这样，对于不使用的方法，实现类也需要去override它，这就有问题了。
 * 所以，有了缺省适配器，在接口和实现类之间加一个缺省适配器，由缺省适配器来实现接口，使用类不再实现原接口，而是继承缺省适配器。
 * @modified By：
 * @version: $
 */
public class SomeCup extends CupAdapter {
    @Override
    public void drink() {
        System.out.println("拿杯子喝水");
    }

    @Override
    public void hold() {
        System.out.println("拿杯子接水");
    }
}
