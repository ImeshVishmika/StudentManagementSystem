/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class LoadData {
       
    public LoadData(String userName){
        loadUserData(userName);
    }
    
    private void loadUserData(String userName) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Students_db", "root", "Imesh#14681");
            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM `student` WHERE `firstName`='" + userName + "' ");

            rs.next();
            System.out.println(rs.getString("email"));

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

  
}
