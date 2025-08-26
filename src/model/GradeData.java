/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class GradeData {

    public List<GradesComboItems> loadData() {
        List<GradesComboItems> grades=new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM `grade`");
            while (rs.next()) {
                     GradesComboItems i=new GradesComboItems(rs.getString("gradeName"),rs.getString("gradeNo"));  
                     grades.add(i);
            }
            
            

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return grades;
        
    }
}
