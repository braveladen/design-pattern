package com.cetc28.designpattern.detail.behaviorType.chainOfResponsibility;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 18:34
 * @description：麦当劳分店接口
 * @modified By：
 * @version: $
 */
public interface Subbranch {

    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);
}
