package com.cetc28.designpattern.detail.structType.proxy.静态代理;

/**
 * @author ：braveladen
 * @date ：Created in 2019/6/24 18:21
 * @description：静态代理类
 * 静态代理类的特征有三点，分别是：
 * 1、静态代理类要实现被代理的接口，这样静态代理类的方法名就和原来被代理接口的方法名保持一致，以便同方法名调用；
 * 2、静态代理类把被代理的接口对象，作为参数传入构造函数，这样静态代理类的方法里，就可以调用被代理接口对象的方法；
 * 3、静态代理类虽然代理了被代理接口的全部方法，但其它我们并不希望所有的方法都被代理和增强，其它的方法还是调用原有接口对接的方法即可。
 * 基于以上静态代理类的特点，其使用场景一般为：
 * 1、被代理的接口只有一个或几个固定的实现类，也即静态代理类其实就是对固定的实现类的增强，这种场景下其实是比动态代理要效率高，因为动态代理要在运行期走反射生成对象。
 * @modified By：
 * @version: $
 */
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionProxy implements Connection{

    private Connection connection;

    public ConnectionProxy(Connection connection) {
        super();
        this.connection = connection;
    }

    @Override
    public Statement createStatement() throws SQLException{
        return connection.createStatement();
    }

    @Override
    public void close() throws SQLException{
        System.out.println("不真正关闭连接，归还给连接池");
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}