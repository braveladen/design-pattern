package com.cetc28.designpattern.detail.createType.factory.简单工厂;

/**
 * @author ：bravaladen
 * @date ：Created in 2019/6/24 19:33
 * @description：简单工厂类
 * 通过下面这个简单工厂类，可以获取实现了同一个接口的不同的servlet实现类。
 * 简单工厂模式，总结起来就是一个工厂类，一个产品接口（其实也可以是一个抽象类，甚至一个普通的父类，但通常我们觉得接口是最稳定的，所以基本不需要考虑普通父类的情况），
 * 和一群实现了产品接口的具体产品，而这个工厂类，根据传入的参数去创造一个具体的实现类，并向上转型为接口作为结果返回。
 * @modified By：
 * @version: $
 */
//相当于简单工厂模式中的产品接口
interface Servlet{}
//相当于简单工厂模式中的抽象父类产品。
//注意，简单工厂在网络上的资料大部分为了简单容易理解都是只规划了一个产品接口，但这不代表就只能有一个，设计模式的使用要灵活多变。
class HttpServlet implements Servlet{}
//具体的产品
class LoginServlet extends HttpServlet{}
class RegisterServlet extends HttpServlet{}
class LoginoutServlet extends HttpServlet{}
//产品工厂
public class ServletFactory {
    private ServletFactory(){}
    //典型的创造产品的方法，一般是静态的，因为工厂不需要有状态。
    public static Servlet createServlet(String servletName){
        if (servletName.equals("login")) {
            return new LoginServlet();
        }else if (servletName.equals("register")) {
            return new RegisterServlet();
        }else if (servletName.equals("loginout")) {
            return new LoginoutServlet();
        }else {
            throw new RuntimeException();
        }
    }
}
