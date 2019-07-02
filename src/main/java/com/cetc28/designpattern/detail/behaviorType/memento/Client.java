package com.cetc28.designpattern.detail.behaviorType.memento;

/**
 * @author ：mmzs
 * @date ：Created in 2019/7/1 19:45
 * @description：调用类
 * 备忘录模式顾名思义就是为对象生成了一个备忘副本，以便进行恢复或者对副本进行监控。
 * 备忘录模式的使用场景如下：
 * 1、需要临时保存和恢复数据或状态；
 * 2、需要对数据或状态进行回滚操作；
 * 3、需要对对象的某些阶段过程、数据、状态，进行监控。
 * 备忘录模式最大的缺点就是很占内存，尤其在如下情况下：
 * 1、在for循环里创建备忘录；
 * 2、备忘录用完不remove；
 * 3、备忘录中有大对象。
 * 上面三种情况都会导致备忘录太占内存，所以要尽量避免。
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        //创建人物
        GamePlayer player = new GamePlayer("习伟", 100, 100, 1);
        //控制备份数据的对象
        CaretakePlayer caretakePlayer = new CaretakePlayer();
        //进行备份
        caretakePlayer.setBackup(player.saveBackup());
        //打怪
        Boolean flag = player.killBoss();

        while(!flag){
            //恢复备份
            player.resumePlayer(caretakePlayer.getBackup());
            System.out.println("====================================");
            System.out.println("满血复活。。。");
            System.out.println("====================================");
            //继续打怪
            flag = player.killBoss();
        }

    }
}
