package com.cetc28.designpattern.detail.behaviorType.strategy.简单策略;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/22 16:11
 * @description：
 * @modified By：
 * @version: $
 */
public class MachineOperationContext {
    private MachineOperation machineOperation;

    public MachineOperationContext(MachineOperation machineOperation) {
        this.machineOperation = machineOperation;
    }

    public void openMachine() {
        machineOperation.openMachine();
    }

    public void closeMachine() {
        machineOperation.closeMachine();
    }
}
