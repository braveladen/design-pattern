package com.cetc28.designpattern.detail.structType.proxy.动态代理;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 18:37
 * @description：动态代理类
 * 通常我们代理接口的时候，也不会会增加他的全部方法，所以在invoke里，我们判断method的属性，来确定给哪些方法增加，比如指定的方法名、指定的方法上注解等。
 * 动态代理生成的Proxy对象，其实是一个InvocationHandler的实现类对象，而不是原接口的实现类对象，只不过在这个InvocationHandler实现类对象中，可以通过反射生成原接口实现类对象，并调用其方法。
 * 目前AOP已经把动态代理封装的很好的，所以我们在写代码的时候不需要自己手动写动态代理。
 * @modified By：
 * @version: $
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class DynamicProxy implements InvocationHandler{

    private Object source;

    public DynamicProxy(Object source) {
        super();
        this.source = source;
    }

    private void before(){
        System.out.println("在方法前做一些事，比如打开事务");
    }

    private void after(){
        System.out.println("在方法返回前做一些事，比如提交事务");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //假设我们切入write方法，其他其实也是类似的，一般我们这里大部分是针对特定的方法做事情的，通常不会对类的全部方法切入
        //比如我们常用的事务管理器，我们通常配置的就是对save,update,delete等方法才打开事务
        if (method.getName().equals("write")) {
            before();
        }
        Object result = method.invoke(source, args);
        if (method.getName().equals("write")) {
            after();
        }
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(getClass().getClassLoader(), source.getClass().getInterfaces(), this);
    }
}
