package com.cetc28.designpattern.detail.behaviorType.strategy.更高级策略;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/27 13:37
 * @description：动态代理类
 * 这个动态代理类代理了所有实现CalPrice接口的类，也即所有的策略类
 * 之所以要用动态代理，不是要对被代理类进行增强，而是要对被代理类进行整合，统一为一个代理类对外提供服务。
 * @modified By：
 * @version: $
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;

public class CalPriceProxy implements InvocationHandler{

    private SortedMap<Integer, Class<? extends CalPrice>> clazzMap;

    private CalPriceProxy(SortedMap<Integer, Class<? extends CalPrice>> clazzMap) {
        super();
        this.clazzMap = clazzMap;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Double result = 0D;
        if (method.getName().equals("calPrice")) {
            for (Class<? extends CalPrice> clazz : clazzMap.values()) {
                if (result == 0) {
                    result = (Double) method.invoke(clazz.newInstance(), args);
                }else {
                    result = (Double) method.invoke(clazz.newInstance(), result);
                }
            }
            return result;
        }
        return null;
    }

    public static CalPrice getProxy(SortedMap<Integer, Class<? extends CalPrice>> clazzMap){
        return (CalPrice) Proxy.newProxyInstance(CalPriceProxy.class.getClassLoader(), new Class<?>[]{CalPrice.class}, new CalPriceProxy(clazzMap));
    }

}