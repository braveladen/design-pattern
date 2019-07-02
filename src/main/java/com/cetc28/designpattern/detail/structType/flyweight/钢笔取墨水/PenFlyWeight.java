package com.cetc28.designpattern.detail.structType.flyweight.钢笔取墨水;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/2 13:35
 * @description：抽象笔类（共享）
 * @modified By：
 * @version: $
 */
public abstract class PenFlyWeight {
    private String color ;
    private final String type;

    public PenFlyWeight(String _type){
        this.type = _type;
    }

    public abstract void draw();

    @Override
    public String toString() {
        return super.toString()+"\t"+color+"\ttype:"+type;
    }

    public void setColor(String _color){
        this.color = _color;
    }


}
