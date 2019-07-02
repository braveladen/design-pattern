package com.cetc28.designpattern.detail.behaviorType.strategy.简单策略;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author ：braveladen
 * @date ：Created in 2019/5/22 16:28
 * @description：
 * @modified By：
 * @version: $
 */
public class MachineOperContAnnotation {
    @Resource
    ApplicationContext applicationContext;

    MachineOperation getInstance(String serviceName) {
        Map service = MachineEnum.getMap();
        String name = (String) service.get(serviceName);
        try {

            Class clazz = Class.forName(this.getClass().getPackage().getName()+"."+name);
            MachineOperation operation = (MachineOperation)clazz.newInstance();
            return operation;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
