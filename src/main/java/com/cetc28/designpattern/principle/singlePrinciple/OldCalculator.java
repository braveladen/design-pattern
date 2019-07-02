package com.cetc28.designpattern.principle.singlePrinciple;

import java.io.*;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/24 8:54
 * @description：
 * @modified By：
 * @version: $
 */
public class OldCalculator {
    public Integer add() throws FileNotFoundException,IOException {
        File file = new File("D:\\cal.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Integer a = Integer.valueOf(reader.readLine());
        Integer b = Integer.valueOf(reader.readLine());
        return a+b;
    }
    public Integer multi() throws FileNotFoundException,IOException {
        File file = new File("D:\\cal.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Integer a = Integer.valueOf(reader.readLine());
        Integer b = Integer.valueOf(reader.readLine());
        return a*b;
    }

    public static void main(String[] args) throws FileNotFoundException,IOException{
        OldCalculator oldCalculator = new OldCalculator();
        System.out.println(oldCalculator.add());
        System.out.println(oldCalculator.multi());
    }
}
