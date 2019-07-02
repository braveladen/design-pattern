package com.cetc28.designpattern.detail.structType.composite.文件系统;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 14:50
 * @description：文件系统通用节点接口
 * @modified By：
 * @version: $
 */
public interface IFile {
    //下面两个方法，相当于类图中operation方法
    void delete();
    String getName();

    /* 以上为公共行为，以下为文件夹才有的行为 */

    //创建新文件，相当于add方法
    void createNewFile(String name);
    //相当于remove方法
    void deleteFile(String name);
    //相当于GetChild方法
    IFile getIFile(int index);
}
