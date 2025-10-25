/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Teacher;

public class TeacherData {

    private String q = "SELECT * FROM `teachers`";

    public List<Teacher> loadData(String txt) {
        List<Teacher> Teachers = new ArrayList<>();

        if (!txt.isBlank()) {
            if (txt.matches("^(?:20|19)\\d{10}$")) {
                q += " WHERE `NIC`='" + txt + "' ";
            } else if (txt.contains("@")) {
                q += " WHERE `email` LIKE '" + txt + "' ";
            } else {
                q += " WHERE `firstName` LIKE '" + txt + "%' ";
            }
        } 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                Teacher t = new Teacher(rs.getString("TNIC"), rs.getString("TName"), rs.getString("Temail"), rs.getString("genderID"));
                Teachers.add(t);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return Teachers;
    }

    public void DeleteData(String nic) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            s.executeUpdate("DELETE FROM `teachers` WHERE `TNIC`='" + nic + "' ");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
