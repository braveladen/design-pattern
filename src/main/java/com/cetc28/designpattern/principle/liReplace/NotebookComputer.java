package com.cetc28.designpattern.principle.liReplace;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/24 9:49
 * @description：
 * @modified By：
 * @version: $
 */
public class NotebookComputer extends Computer {
    @Override
    public void play() {
        System.out.println("我是笔记本电脑，不能打游戏！");
    }
}
