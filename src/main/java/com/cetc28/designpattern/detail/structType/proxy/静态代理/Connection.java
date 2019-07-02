package com.cetc28.designpattern.detail.structType.proxy.静态代理;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;

public interface Connection  extends Wrapper {

    Statement createStatement() throws SQLException;

    void close() throws SQLException;

}
