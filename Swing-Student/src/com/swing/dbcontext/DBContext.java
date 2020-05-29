/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.dbcontext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tuan Nguyen
 */
public class DBContext {

    private static DBContext instance;
    
    private DBContext() {}
    
    public static DBContext getInstance() {
        if (instance == null) {
            instance = new DBContext();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://" + serverName + ":" + port + ";databasename=" + databaseName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, username, password);
    }

    private final String serverName = "DESKTOP-R45NTMI\\SQLEXPRESS";
    private final String databaseName = "testJDBC";
    private final String port = "1433";
    private final String username = "sa";
    private final String password = "123123";

}
