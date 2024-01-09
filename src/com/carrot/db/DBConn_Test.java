package com.carrot.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn_Test {
  private static DBConn_Test dbConn = new DBConn_Test();

  private DBConn_Test() {  }

  public static DBConn_Test getInstance() {
    return dbConn;
  }

  public Connection getConn() {
    Connection conn = null;

    try {
      Class.forName("org.mariadb.jdbc.Driver");
      String url = "jdbc:mariadb://guro.wisejia.com:3308/c23c_26";
      conn = DriverManager.getConnection(url, "c23c_26", "54321");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

}
