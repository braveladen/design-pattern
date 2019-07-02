package com.cetc28.designpattern.detail.behaviorType.template;

import com.cetc28.designpattern.principle.dependConvert.AbastractUser;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/27 16:51
 * @description：模板方法的使用类，即模板方法的子类。
 * 在模板方法圈定的范围内，实现某个方法，其中包括一定要实现的抽象方法和不一定要实现的非抽象方法。
 * 这里跟缺省适配器有点类似，强制实现部分抽象方法，其它的非抽象方法选择性实现。
 * @modified By：
 * @version: $
 */
public class MyPageBuilder extends AbstractPageBuilder {
    //非抽象方法，可选择性实现
    @Override
    protected void appendMeta(StringBuffer stringBuffer) {
        stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
    }
    //抽象方法，必须要实现
    @Override
    protected void appendTitle(StringBuffer stringBuffer) {
        stringBuffer.append("<title>你好</title>");
    }
    //抽象方法，必须要实现
    @Override
    protected void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>你好，世界！</body>");
    }

    public static void main(String[] args) {
        PageBuilder pageBuilder = new MyPageBuilder();
        System.out.println(pageBuilder.bulidHtml());
    }
}
