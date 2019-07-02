package com.cetc28.designpattern.detail.behaviorType.strategy.简单策略;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：braveladen
 * @date ：Created in 2019/5/22 16:28
 * @description：
 * @modified By：
 * @version: $
 */
public enum MachineEnum {
    TELEPHONE("telephone", "TelephoneOperation"),
    NOTEBOOK("notebook", "NotebookOperation");

    private String machineName;
    private String machineService;
    private static final Map<String, String> map = new HashMap<String, String>();

    static {
        for (MachineEnum xx : MachineEnum.values()) {
            map.put(xx.machineName, xx.machineService);
        }
    }

    private MachineEnum(String machineName, String machineService) {
        this.machineName = machineName;
        this.machineService = machineService;
    }

    public static Map<String, String> getMap() {
        return map;
    }
}
