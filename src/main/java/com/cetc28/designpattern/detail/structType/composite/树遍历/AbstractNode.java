package com.cetc28.designpattern.detail.structType.composite.树遍历;

import com.cetc28.designpattern.detail.behaviorType.template.AbstractPageBuilder;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:39
 * @description：树节点抽象类
 * @modified By：
 * @version: $
 */
public abstract class AbstractNode implements Node{
    protected String name;
    public AbstractNode(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
