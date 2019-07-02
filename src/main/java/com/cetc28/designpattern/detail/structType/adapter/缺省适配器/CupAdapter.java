package com.cetc28.designpattern.detail.structType.adapter.缺省适配器;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/27 14:49
 * @description：缺省适配器，实现被适配的接口，每个方法都为空就可
 * @modified By：
 * @version: $
 */
public abstract class CupAdapter implements Cup {
    @Override
    public abstract void drink();

    @Override
    public abstract void hold();

    @Override
    public void pour() {

    }
}
