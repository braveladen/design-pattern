package com.cetc28.designpattern.detail.behaviorType.template;

/**
 * @author ：mmzs
 * @date ：Created in 2019/6/27 16:50
 * @description：模板方法类
 * 模板方法类的需求是：想规范类或接口的实现，不希望过度自由地实现接口，因此规定一个模板，把方法先实现了，在方法的内部，如果有可以变化的，可以交给子类去灵活实现。
 * 采用模板方法以后，子类对于整个方法的实现就只有部分实现权限了，因为方法的整体实现已经在模板类中定好了而且不能改，留给子类实现的空间有限。
 * 其实说白了，就是把各个子类当中某个功能的公共固定的部分抽出来，放到模板类中先实现好，然后子类只实现部分功能。
 * @modified By：
 * @version: $
 */
public abstract class AbstractPageBuilder implements PageBuilder{

    private static final String DEFAULT_DOCTYPE = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";

    private static final String DEFAULT_XMLNS = "http://www.w3.org/1999/xhtml";

    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public String bulidHtml() {
        stringBuffer.append(DEFAULT_DOCTYPE);
        stringBuffer.append("<html xmlns=\"" + DEFAULT_XMLNS + "\">");
        stringBuffer.append("<head>");
        appendTitle(stringBuffer);
        appendMeta(stringBuffer);
        appendLink(stringBuffer);
        appendScript(stringBuffer);
        stringBuffer.append("</head>");
        appendBody(stringBuffer);
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    protected void appendMeta(StringBuffer stringBuffer){
    }

    protected void appendLink(StringBuffer stringBuffer){
    }

    protected void appendScript(StringBuffer stringBuffer){
    }

    protected abstract void appendTitle(StringBuffer stringBuffer);

    protected abstract void appendBody(StringBuffer stringBuffer);

}
