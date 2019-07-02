package com.cetc28.designpattern.detail.behaviorType.strategy.高级策略;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/26 15:30
 * @description：策略类
 * 可以看出，策略类其实很简单，就是实现策略接口中的方法。
 * 但是，真正复杂的是，对于策略类的完善，比如，此例中，4个策略类的选择，是根据顾客消费总额的多少来确定的，可以使用3个方式来选择策略类：
 * 1、直接在Customer中，通过if else判断当前顾客消费了多少总额，来选择new哪个策略类；
 * 2、写一个简单工厂，把customer类中的if else判断拿到简单工厂中，策略类的生成由简单工厂负责；
 * 3、通过在策略类上加注解，把顾客消费额度与策略类的对应关系直接加上策略类的注解上，这样，在工厂方法中，通过获取策略类的注解和当前顾客的消费总额，就可以直接确定返回哪个策略类。
 * 上面3种方法，由易到难，也由垃圾到完善。
 * 所以说，策略模式的完善才是真正的难点。策略模式最大的缺点就在于策略类的选择与切换，难点在于尽可能让策略类的选择可扩展性高，而不能用ifelse这种低端方式。
 * @modified By：
 * @version: $
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double originalPrice);
}
@TotalValidRegion(max=1000)//设置普通的在0-1000生效，以下类似，不再注释
class Common implements CalPrice{
    private double zeco = 1.0;
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice*zeco;
    }

}
@TotalValidRegion(min=1000,max=2000)
class Vip implements CalPrice{
    private double zeco = 0.8;
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice *zeco;
    }

}
@TotalValidRegion(min=2000,max=3000)
class SuperVip implements CalPrice{
    private double zeco = 0.7;
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice *zeco;
    }

}
@TotalValidRegion(min=3000)
class GoldVip implements CalPrice{
    private double zeco = 0.5;
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice *zeco;
    }

}
