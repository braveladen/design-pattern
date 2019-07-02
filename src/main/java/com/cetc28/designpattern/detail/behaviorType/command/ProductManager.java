package com.cetc28.designpattern.detail.behaviorType.command;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/29 13:39
 * @description：产品经理
 * 这个类相当于命令模式中的的invoker，即方法的调用者，由它进行命令的调用。
 * invoker的引入不光在于执行命令，还在于进行命令的管理，包括：
 * 1、对命令进行排列或排序执行；
 * 2、记录命令列表等。
 * @modified By：
 * @version: $
 */
public class ProductManager {
    private final static Integer TASK_NUMBER_IN_DAY_PERSON = 4;
    private int currentIndex;
    private List<Task> taskList;
    private List<Programmer> programmerList;
    private ConcurrentHashMap<String, AtomicInteger> programmerIndexMap;
    public ProductManager(Programmer... programmers) {
        super();
        if (programmers == null || programmers.length == 0) {
            throw new RuntimeException("产品经理手下没有程序员，任务分配不出去，无法正常工作！");
        }
        taskList = new LinkedList<Task>();
        programmerList = Arrays.asList(programmers);
        programmerIndexMapInit();
    }
    private void programmerIndexMapInit(){
        programmerIndexMap = new ConcurrentHashMap<>();
        for(Programmer programmer : programmerList){
            programmerIndexMap.put(programmer.getName(),new AtomicInteger());
        }
    }
    //接受一个任务
    public void receive(Task task){
        taskList.add(task);
    }
    //产品经理可以选择程序猿，简单的循环选取。
    public Programmer chooseProgrammer(){
        return programmerList.get(currentIndex++%programmerList.size());
    }
    public void assign(){
        Task[] copy = new Task[taskList.size() > TASK_NUMBER_IN_DAY_PERSON * programmerList.size()  ? taskList.size() - TASK_NUMBER_IN_DAY_PERSON * programmerList.size() : 0];
        Iterator iterator = taskList.iterator();
        while(iterator.hasNext()){
            Task task = (Task)iterator.next();
            Programmer programmer = task.getProgrammer();
            AtomicInteger index = programmerIndexMap.get(programmer.getName());
            if(index.get()>=TASK_NUMBER_IN_DAY_PERSON){
                continue;
            }else{
                task.handle();
                index.incrementAndGet();
                programmerIndexMap.put(programmer.getName(),index);
                iterator.remove();
            }
        }
        programmerIndexMapInit();
    }
    public void printTaskList(){
        if (taskList == null || taskList.size() == 0) {
            System.out.println("----------当前无任务--------");
            return;
        }
        System.out.println("---------当前剩下的任务列表--------");
        for (Task task : taskList) {
            System.out.println(task);
        }
        System.out.println("----------------------------------");
    }
}
