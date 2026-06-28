/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dto.Subject;

/**
 *
 * @author USER
 */
public class SubjectData {

    DB db = new DB();

    public List<Subject> loadData(String txt) {

        List<Subject> subjects = new ArrayList<>();

        String q = """
                                          SELECT * FROM 
                                          `subjects_in_grades` JOIN `teachers_has_subjects`
                                           ON `subjects_in_grades`.`gradeSubID`= `teachers_has_subjects`.`subject`
                                          JOIN `teachers` ON `teachers_has_subjects`.`teacher`=`teachers`.`TNIC`
                                          JOIN `subject` ON `subjects_in_grades`.`subjectID`=`subject`.`id` """;

        if (!txt.isBlank()) {
            if (txt.matches("^(?:20|19)\\d{10}$")) {
                q += " WHERE `Tnic`='" + txt + "' ";
            } else if (txt.contains("@")) {
                q += " WHERE `Temail` LIKE '" + txt + "' ";
            } else {
                q += " WHERE `firstName` LIKE '" + txt + "%' OR `lastName` LIKE '" + txt + "%'  OR `subjectName` LIKE '" + txt + "%' OR `grade` LIKE '" + txt + "%' ";
            }
        }

        try {

            ResultSet rs = db.search(q);

            while (rs.next()) {
                Subject sub = new Subject(rs.getString("subjectName"), rs.getString("grade"), rs.getString("firstName") + " " + rs.getString("lastName"), rs.getString("teacherSubID"));
                subjects.add(sub);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjects;
    }

    public List<Subject> loadSubjects(String grade) {

        List<Subject> subjects = new ArrayList<>();

        String q = "SELECT * FROM `subjects_in_grades` JOIN `subject` ON `subjects_in_grades`.`subjectID`=`subject`.`id` ";

        if (grade != null && !grade.isEmpty()) {
            q += " WHERE `grade`=" + grade;
            System.out.println(q);
        }

        try {

            ResultSet rs = db.search(q);

            while (rs.next()) {
                Subject sub = new Subject(rs.getString("subjectName"), rs.getString("grade"));
                subjects.add(sub);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjects;
    }

    public boolean addSubject(Subject s) {

        String subjectName = s.getSubjectName();

        boolean success=db.iud("INSERT INTO `subject`(`subjectName`)  VALUES('" + subjectName + "')");
        return success;

    }

}
