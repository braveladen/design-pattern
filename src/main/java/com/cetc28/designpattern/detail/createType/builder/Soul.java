package com.cetc28.designpattern.detail.createType.builder;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 18:42
 * @description：灵魂类，指挥者
 * 指挥者负责执行建造过程，即通过调用建造者接口的建造方法，实现建造过程。
 * @modified By：
 * @version: $
 */
public class Soul {
    public Doppelganger createDoppelganger(DoppelgangerBuilder doppelgangerBuilder,String name){
        doppelgangerBuilder.createDoppelganger(name);
        doppelgangerBuilder.buildBody();
        doppelgangerBuilder.buildHead();
        doppelgangerBuilder.buildLeftArm();
        doppelgangerBuilder.buildLeftHand();
        doppelgangerBuilder.buildRightArm();
        doppelgangerBuilder.buildRightHand();
        doppelgangerBuilder.buildLeftLeg();
        doppelgangerBuilder.buildLeftFoot();
        doppelgangerBuilder.buildRightLeg();
        doppelgangerBuilder.buildRightFoot();
        return doppelgangerBuilder.getDoppelganger();
    }
}
