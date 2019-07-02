package com.cetc28.designpattern.detail.structType.composite.文件系统;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 14:51
 * @description：文件夹
 * @modified By：
 * @version: $
 */
//文件夹
public class Folder implements IFile{

    private String name;
    //自己
    private IFile folder;
    //文件夹下的文件
    private List<IFile> files;

    public Folder(String name) {
        this(name, null);
    }

    public Folder(String name,IFile folder) {
        super();
        this.name = name;
        this.folder = folder;
        files = new ArrayList<IFile>();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    //与File的删除方法不同，先删除下面的文件以及文件夹后再删除自己
    public void delete() {
        List<IFile> copy = new ArrayList<IFile>(files);
        System.out.println("------------删除子文件-------------");
        for (IFile file : copy) {
            file.delete();
        }
        System.out.println("----------删除子文件结束-------------");
        if (folder != null) {
            folder.deleteFile(name);
        }
        System.out.println("---删除[" + name + "]---");
    }
    @Override
    public void createNewFile(String name) {
        if (name.contains(".")) {
            files.add(new File(name,this));
        }else {
            files.add(new Folder(name,this));
        }
    }
    @Override
    public void deleteFile(String name) {
        for (IFile file : files) {
            if (file.getName().equals(name)) {
                files.remove(file);
                break;
            }
        }
    }
    @Override
    public IFile getIFile(int index) {
        return files.get(index);
    }

}