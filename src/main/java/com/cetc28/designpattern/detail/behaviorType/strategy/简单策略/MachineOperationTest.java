package com.cetc28.designpattern.detail.behaviorType.strategy.简单策略;

import java.util.Map;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/22 16:13
 * @description：
 * @modified By：
 * @version: $
 */
public class MachineOperationTest {
    public static void main(String[] args) {
        MachineOperContAnnotation machineOperContAnnotation = new MachineOperContAnnotation();
        MachineOperationContext context1 = new MachineOperationContext(machineOperContAnnotation.getInstance("notebook"));
        context1.openMachine();
        MachineOperationContext context2 = new MachineOperationContext(machineOperContAnnotation.getInstance("telephone"));
        context2.openMachine();
    }
}
