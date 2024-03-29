package com.cetc28.designpattern.detail.behaviorType.strategy.更高级策略;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 13:36
 * @description：
 * @modified By：
 * @version: $
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//这是我们针对单次消费的有效区间注解，可以给策略添加有效区间的设置
@Target(ElementType.TYPE)//表示只能给类添加该注解
@Retention(RetentionPolicy.RUNTIME)//这个必须要将注解保留在运行时
public @interface OnceValidRegion{
    //我们引用有效区间注解
    ValidRegion value() default @ValidRegion;
}