package com.cetc28.designpattern.detail.behaviorType.command;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/29 13:29
 * @description：命令接口
 * 命令接口的实现类就是命令，命令的作用在于：
 * 1、方法的调用者与方法的执行者之间过度耦合，为了降低耦合，将方法抽取出来，作为一个命令，命令由方法的调用者来调用，而命令又知道他是由哪个执行者来执行的。
 * @modified By：
 * @version: $
 */
public interface Task {
    void handle();
    Programmer getProgrammer();
}
