package com.cetc28.designpattern.detail.structType.bridge;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 11:10
 * @description：技能接口
 * @modified By：
 * @version: $
 */
public interface Skills {
    public void releaseSkills();

}
//隐身技能
class Invisible implements Skills{
    @Override
    public void releaseSkills(){
        System.out.println("释放隐身技能");
    }
}
//飞行技能
class Volant implements Skills{
    @Override
    public void releaseSkills(){
        System.out.println("释放飞行技能");
    }
}
//读心术技能
class ReadMind implements Skills{
    @Override
    public void releaseSkills(){
        System.out.println("释放读心术技能");
    }
}