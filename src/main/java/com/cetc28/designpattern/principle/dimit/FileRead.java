package com.cetc28.designpattern.principle.dimit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 13:18
 * @description：
 * 迪米特法则要求类对外暴露的方法和属性要尽可能少，尽可能申明为private；
 * 尽量在内部处理完以后，再通过public方法对外暴跌，而不能把所有的方法都暴露给调用方来实现功能，要不然很容易形成高度耦合的代码。
 * 迪米特法则同样体现了高内聚，低耦合的思想，功能通过private方法自己实现，而对外则提供调用的方法，也即实现私有，调用公有。
 * @modified By：
 * @version: $
 */
public class FileRead {
    int a,b;
    private String path;
    private BufferedReader br;
    public FileRead(String path) throws Exception{
        super();
        this.path = path;
        setBufferedReader();
        readLine();
    }
    //注意，我们变为私有的方法
    private void setBufferedReader() throws FileNotFoundException {
        br = new BufferedReader(new FileReader(path));
    }
    //注意，我们变为私有的方法
    private void readLine() throws NumberFormatException, IOException {
        a = Integer.valueOf(br.readLine());
        b = Integer.valueOf(br.readLine());
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
}
