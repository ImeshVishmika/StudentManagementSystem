/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SubjectData {

    public List<Subject> loadData(String grade) {

        List<Subject> subjects = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("""
                                          SELECT * FROM 
                                          `subjects_in_grades` JOIN `teachers_has_subjects`
                                           ON `subjects_in_grades`.`gradeSubID`= `teachers_has_subjects`.`subject`
                                          JOIN `teachers` ON `teachers_has_subjects`.`teacher`=`teachers`.`TNIC`
                                          JOIN `subject` ON `subjects_in_grades`.`subjectID`=`subject`.`id` WHERE `grade`='"""+grade+"' ");
            
            while(rs.next()){
                Subject sub= new Subject(rs.getString("subjectName"),rs.getString("grade"),rs.getString("TName"),rs.getString("teacherSubID"));
                subjects.add(sub);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
               e.printStackTrace();
        }
        
        return subjects;
    }

}
