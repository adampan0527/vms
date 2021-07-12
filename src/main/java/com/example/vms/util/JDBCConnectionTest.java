package com.example.vms.util;

import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {
    public Connection getConnection() throws Exception {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vip_management_system?characterEncoding=utf8&useSSL=false", "root", "123456");
        return connection;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new JDBCConnectionTest().getConnection().toString());
    }

}
