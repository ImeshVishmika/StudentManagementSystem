/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dto.Student;
import dto.Subject;

public class StudentData {

    DB db = new DB();

    private String q = "SELECT * FROM `student`";

    public String studentCount() {

        String count = null;

        try {
            ResultSet rs = db.search("SELECT COUNT(*) FROM `student`");
            rs.next();
            count = String.valueOf(rs.getInt("COUNT(*)"));
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;

    }

    public List<Student> loadData(String txt) {

        List<Student> students = new ArrayList<>();

        if (!txt.isBlank()) {
            if (txt.matches("^(?:20|19)\\d{10}$")) {
                q += " WHERE `NIC`='" + txt + "' ";
            } else if (txt.contains("@")) {
                q += " WHERE `email` LIKE '" + txt + "' ";
            } else {
                q += " WHERE `firstName` LIKE '" + txt + "%' OR `lastName` LIKE'" + txt + "%' ";
            }
        } else {
            q = "SELECT * FROM `student`";
        }

        try {

            ResultSet rs = db.search(q);
            while (rs.next()) {
                Student st = new Student(rs.getString("NIC"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"), rs.getString("genderID"), null);
                students.add(st);
            }
            q = "SELECT * FROM `student`";
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    public void deleteData(String nic) {
        db.iud("DELETE FROM `student` WHERE `NIC`='" + nic + "' ");
    }

    public boolean addData(Student s) {

        String nic = s.getNic();
        String firstName = s.getFirstName();
        String lastName = s.getLastName();
        String email = s.getEmail();
        String gender = s.getGender();
        List<Subject> subjects = s.getSubjects();
        int success = 0;

        db.iud("INSERT INTO `student`(`NIC`,`firstName`,`lastName`,`email`,`genderID`) "
                + "VALUES('" + nic + "','" + firstName + "','" + lastName + "','" + email + "','" + gender + "')");

        for (Subject sub : subjects) {
            db.iud("INSERT INTO `student_enrollment`(`student_NIC`,`teachersSubID`) VALUES('" + nic + "','" + sub.getTeacherSubID() + "')");
        }

        return success > 0;
    }

    public boolean verifyData(String nic, String email) {
        boolean data = false;
        try {
            ResultSet rs = db.search("SELECT COUNT(*) FROM `student` WHERE `NIC`='" + nic + "' OR `email`='" + email + "' ");
            rs.next();
            data = rs.getString("COUNT(*)").equals("0");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;

    }

}
