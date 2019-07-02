package com.cetc28.designpattern.detail.behaviorType.mediator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/1 9:52
 * @description：模式联盟，中介者
 * 中介者用来将网状结构的类依赖关系,转换为星形结构的类依赖关系.
 * 一般来说,我们是允许类与类之间的维护相互之间的依赖关系的,只有在如下情况下才考虑使用中介者:
 * 1、类的数据比较多；
 * 2、类与类之间形成了网状结构。
 * 使用中介者以后，类与类之间就不再相互依赖了，类依赖中介者，且中介者维护一个类的列表，并管理类与类之间的依赖关系或调用关系。
 * @modified By：
 * @version: $
 */
import java.util.ArrayList;
import java.util.List;

public class PatternAlliance implements IPatternAlliance {

    private List<School> schoolList;

    public PatternAlliance() {
        super();
        schoolList = new ArrayList<School>();
    }

    @Override
    public void add(School school){
        schoolList.add(school);
    }
    @Override
    public void resolveAttack(School activeSide,School passiveSide){
        if (schoolList.contains(activeSide) && schoolList.contains(passiveSide)) {
            System.out.println("主攻方" + activeSide.getName() + "以及被攻方" + passiveSide.getName() + "都已加入联盟，不允许内讧！");
        }else if (schoolList.contains(activeSide) && !schoolList.contains(passiveSide)) {
            System.out.println("主攻方" + activeSide.getName() + "已加入联盟，被攻方" + passiveSide.getName() + "不在联盟之中，将集体攻打该门派！");
            for (School school : schoolList) {
                school.attack(passiveSide);
            }
        }else {
            System.out.println("主攻方" + activeSide.getName() + "未加入联盟，联盟无权干预此事！");
            activeSide.attack(passiveSide);
        }
    }
    @Override
    public void resolveDefense(School passiveSide){
        if (schoolList.contains(passiveSide)) {
            System.out.println("被攻方" + passiveSide.getName() + "已加入联盟，联盟将齐力防御！");
            for (School school : schoolList) {
                school.defense();
            }
        }else {
            System.out.println("被攻方" + passiveSide.getName() + "未加入联盟，联盟不给予防御帮助！");
            passiveSide.defense();
        }
    }

}
