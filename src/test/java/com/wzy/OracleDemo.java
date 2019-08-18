package com.wzy;

import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;
import org.junit.Test;

import java.sql.*;
import java.util.concurrent.Callable;

public class OracleDemo {

    /**
     * java调用存储函数
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void javaCallfunction() throws ClassNotFoundException, SQLException {
    Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.153.2:1521:orcl", "wzy", "wzy");
        CallableStatement callableStatement = connection.prepareCall("{?=call f_yearsal(?)}");
        //给参数赋值
        callableStatement.setObject(2,7788);
        callableStatement.registerOutParameter(1,OracleTypes.NUMBER);
        callableStatement.execute();
        System.out.println(callableStatement.getObject(1));
        callableStatement.close();
        connection.close();
    }

    /**
     * java调用存储过程
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void javaCallProcedures() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.153.2:1521:orcl", "wzy", "wzy");
        CallableStatement preparedStatement = connection.prepareCall("{call p_yearsal(?,?)}");
        //给参数赋值
        preparedStatement.setObject(1,7788);
        preparedStatement.registerOutParameter(2, OracleTypes.NUMBER);
        preparedStatement.execute();
        System.out.println(preparedStatement.getObject(2));
        preparedStatement.close();
        connection.close();
    }
}
