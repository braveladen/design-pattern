package com.cetc28.designpattern.detail.structType.composite.文件系统;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 14:59
 * @description：文件类
 * 由于IFile中有createNewFile、deleteFile、getIFile等Folder类的方法，所以此处也需要实现这三个方法，但内部无实现。
 * 当然，我们也可以在IFile中把这三个方法删了，在Folder中去实现，但是如果这样的话，每次通过接口来调用这三个方法时，都需要通过instanceof确定当前对象是不是Folder的对象，才能调这三个方法，这样的话，我们抽象出接口的意义就不大了。
 * 所以，要么使用本例中的方法，牺牲安全性，把非通用接口暴露给所有实现类；要么按上面的方面，牺牲透明性，保证接口的安全性。
 * 建议使用本例中的方式，保证透明性。
 * 使用组合模式的场景：
 * 1、树形层次结构；
 * 2、期望对于树形结构的叶元素与非叶元素，都采用统一的接口方法操作。
 * @modified By：
 * @version: $
 */
public class File implements IFile{

    private String name;
    private IFile folder;//自己

    public File(String name,IFile folder) {
        super();
        this.name = name;
        this.folder = folder;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void delete() {
        //删除自己
        folder.deleteFile(name);
        System.out.println("---删除[" + name + "]---");
    }
    @Override
    //文件不支持创建新文件
    public void createNewFile(String name) {
        throw new UnsupportedOperationException();
    }
    @Override
    //文件不支持删除文件
    public void deleteFile(String name) {
        throw new UnsupportedOperationException();
    }
    @Override
    //文件不支持获取下面的文件列表
    public IFile getIFile(int index) {
        throw new UnsupportedOperationException();
    }

}