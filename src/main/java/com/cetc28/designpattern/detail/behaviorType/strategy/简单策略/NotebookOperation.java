package com.cetc28.designpattern.detail.behaviorType.strategy.简单策略;

import org.springframework.stereotype.Service;

/**
 * @author ：braveladen
 * @date ：Created in 2019/5/22 16:10
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class NotebookOperation implements MachineOperation {
    @Override
    public void openMachine() {
        System.out.println("笔记本开机！！！！！！！");
    }

    @Override
    public void closeMachine() {
        System.out.println("笔记本关机！！！！！！！");
    }
}
