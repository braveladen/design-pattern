package com.cetc28.designpattern.detail.createType.builder;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 18:39
 * @description：分身制造者接口
 * 建造者接口，该接口将复杂元素的建造过程抽象成接口；
 * 建造者接口可以有多个实现，每一个实现都代表了一种类型的建造结果对象；
 * Creator只需要调用这个建造者接口的具体实现类，就可以直接建造一个对象 。
 * @modified By：
 * @version: $
 */
public interface DoppelgangerBuilder {

    void createDoppelganger(String name);

    void buildBody();

    void buildHead();

    void buildLeftArm();

    void buildLeftHand();

    void buildRightArm();

    void buildRightHand();

    void buildLeftLeg();

    void buildLeftFoot();

    void buildRightLeg();

    void buildRightFoot();

    Doppelganger getDoppelganger();

}
