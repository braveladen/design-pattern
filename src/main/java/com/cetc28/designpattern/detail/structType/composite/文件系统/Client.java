package com.cetc28.designpattern.detail.structType.composite.文件系统;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:03
 * @description：调用类
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        IFile root = new Folder("我的电脑");
        root.createNewFile("C盘");
        root.createNewFile("D盘");
        root.createNewFile("E盘");
        IFile D = root.getIFile(1);
        D.createNewFile("project");
        D.createNewFile("电影");
        IFile project = D.getIFile(0);
        project.createNewFile("test1.java");
        project.createNewFile("test2.java");
        project.createNewFile("test3.java");
        IFile movie = D.getIFile(1);
        movie.createNewFile("致青春.avi");
        movie.createNewFile("速度与激情6.avi");

        /* 以上为当前文件系统的情况，下面我们尝试删除文件和文件夹 */
        display(null, root);
        System.out.println();

        project.delete();
        movie.getIFile(1).delete();

        System.out.println();
        display(null, root);
    }

    //打印文件系统
    public static void display(String prefix,IFile iFile) {
        if (prefix == null) {
            prefix = "";
        }
        System.out.println(prefix + iFile.getName());
        if (iFile instanceof Folder) {
            for (int i = 0; ; i++) {
                try {
                    if (iFile.getIFile(i) != null) {
                        display(prefix + "--", iFile.getIFile(i));
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
    }
}
