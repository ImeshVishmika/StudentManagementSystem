/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Teacher;

public class TeacherData {

    DB db = new DB();

    private String q = "SELECT * FROM `teachers`";

    public List<Teacher> loadData(String txt) {
        List<Teacher> Teachers = new ArrayList<>();

        if (txt != null && !txt.isBlank()) {
            if (txt.matches("^(?:20|19)\\d{10}$")) {
                q += " WHERE `Tnic`='" + txt + "' ";
            } else if (txt.contains("@")) {
                q += " WHERE `Temail` LIKE '" + txt + "' ";
            } else {
                q += " WHERE `firstName` LIKE '" + txt + "%' OR `lastName` LIKE '" + txt + "%' ";
            }
        }

        try {

            ResultSet rs = db.search(q);
            q = "SELECT * FROM `teachers`";
            while (rs.next()) {
                Teacher t = new Teacher(rs.getString("TNIC"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("Temail"), rs.getString("genderID"));
                Teachers.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Teachers;
    }

    public boolean addData(Teacher t) {

        String nic = t.getNic();
        String firstName = t.getFirstName();
        String lastName = t.getLastName();
        String email = t.getEmail();
        String gender = t.getGender();

        boolean success;

        success = db.iud("INSERT INTO `teachers`(`TNIC`,`firstName`,`lastName`,`Temail`,`genderID`) "
                + "VALUES('" + nic + "','" + firstName + "','" + lastName + "','" + email + "','" + gender + "')");

        return success;
    }

    public void DeleteData(String nic) {
            db.iud("DELETE FROM `teachers` WHERE `TNIC`='" + nic + "' ");
    }

    public boolean verifyData(String nic, String email) {
        boolean data = false;
        try {
            ResultSet rs = db.search("SELECT COUNT(*) FROM `teachers` WHERE `Tnic`='" + nic + "' OR `Temail`='" + email + "' ");
            rs.next();
            data = rs.getString("COUNT(*)").equals("0");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;

    }
}
