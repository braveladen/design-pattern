package com.cetc28.designpattern.principle.singlePrinciple;

import java.io.*;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 9:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Reader {
    File file;
    BufferedReader reader;
    public Reader(String filePath) throws FileNotFoundException {
        file = new File(filePath);
        reader = new BufferedReader(new FileReader(file));
    }
    public String readLine() throws  IOException {
        return reader.readLine();
    }
}
