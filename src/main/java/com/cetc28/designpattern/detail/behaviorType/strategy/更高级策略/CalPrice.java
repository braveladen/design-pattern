package com.cetc28.designpattern.detail.behaviorType.strategy.更高级策略;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 13:37
 * @description：策略接口
 * 在高级策略的基础上，又增加了新的策略规则，且新的策略规则要与老的策略规划重叠使用，相当于有两套重叠使用的策略。
 * 此外策略类采用嵌套注解的方式，之所以使用嵌套注解，而不使用独立注解，是为了避免代码的重复，就跟父子类的继承关系一样。
 * @modified By：
 * @version: $
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double originalPrice);
}

//我们使用嵌套注解，并且制定我们打折的各个策略顺序是99，这算是很靠后的
//因为我们最后打折算出来钱是最多的，这个一算就很清楚，LZ不再解释数学问题
@TotalValidRegion(@ValidRegion(max=1000,order=99))
class Common implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}
@TotalValidRegion(@ValidRegion(min=1000,max=2000,order=99))
class Vip implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}
@TotalValidRegion(@ValidRegion(min=2000,max=3000,order=99))
class SuperVip implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}
@TotalValidRegion(@ValidRegion(min=3000,order=99))
class GoldVip implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}
@OnceValidRegion(@ValidRegion(min=1000,max=2000,order=40))
class OneTDTwoH implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice - 200;
    }

}

@OnceValidRegion(@ValidRegion(min=2000,order=40))
class TwotDFourH implements CalPrice{
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice - 400;
    }

}