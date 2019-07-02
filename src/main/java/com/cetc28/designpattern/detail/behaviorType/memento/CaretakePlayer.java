package com.cetc28.designpattern.detail.behaviorType.memento;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/1 19:44
 * @description：备份管理负责人角色
 * @modified By：
 * @version: $
 */
/**
 * 负责人角色，
 * 控制备份
 */
public class CaretakePlayer {

    //游戏备份对象
    private GameBackup backup;

    public GameBackup getBackup() {
        return backup;
    }

    public void setBackup(GameBackup backup) {
        this.backup = backup;
    }

}
