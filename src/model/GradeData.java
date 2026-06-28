/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class GradeData {
    
      DB db = new DB();

    public List<ComboItem> loadData() {
        List<ComboItem> grades=new ArrayList<>();
       
        try {
            ResultSet rs = db.search("SELECT * FROM `grade`");
            while (rs.next()) {
                     ComboItem i=new ComboItem(rs.getString("gradeName"),rs.getString("gradeNo"));  
                     grades.add(i);
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return grades;
        
    }
}
