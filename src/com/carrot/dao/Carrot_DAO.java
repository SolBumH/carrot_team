package com.carrot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carrot.db.DBConn_Test;
import com.carrot.dto.Carrot_DTO;

public class Carrot_DAO {
  
  public List<Carrot_DTO> doTest_one() {
    Connection conn = DBConn_Test.getInstance().getConn();
    List<Carrot_DTO> list = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String random = String.valueOf((int) (Math.random() * 30 + 1));
    String sql = "select * from 5_team_carrot where test_no=?";
    
    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, random);
      rs = pstmt.executeQuery();
      list = new ArrayList<Carrot_DTO>();
      
      if (rs.next()) {
        Carrot_DTO dto = new Carrot_DTO();
        dto.setTest_content(rs.getString("test_content"));
        dto.setTest_answer(rs.getInt("test_answer"));
        dto.setTest_level(rs.getInt("test_level"));
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(conn, pstmt, rs);
    }
    
    return list;
  }
  
  public List<Carrot_DTO> doTest() {
    Connection conn = DBConn_Test.getInstance().getConn();
    List<Carrot_DTO> list = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    // String random = String.valueOf((int) (Math.random() * 30 + 1));
    String sql = "select * from 5_team_carrot"; // where test_no=?";
    
    try {
      pstmt = conn.prepareStatement(sql);
      // pstmt.setString(1, random);
      rs = pstmt.executeQuery();
      list = new ArrayList<Carrot_DTO>();
      
      while (rs.next()) {
        Carrot_DTO dto = new Carrot_DTO();
        dto.setTest_content(rs.getString("test_content"));
        dto.setTest_answer(rs.getInt("test_answer"));
        dto.setTest_level(rs.getInt("test_level"));
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(conn, pstmt, rs);
    }
    
    return list;
  }

  private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (pstmt != null) {
      try {
        pstmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  
}
