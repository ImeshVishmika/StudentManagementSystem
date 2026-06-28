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
import dto.Schedule;

/**
 *
 * @author USER
 */
public class ScheduleData {
    
    DB db = new DB();

    private String q = "SELECT * FROM `schedule`\n"
            + "JOIN `teachers` ON `schedule`.`teacherId` = `teachers`.`TNIC`\n"
            + "JOIN `grade` ON `schedule`.`grade` = `grade`.`gradeNo`\n"
            + "JOIN `subject` ON `schedule`.`subject` = `subject`.`id`";

    public List<Schedule> loadData() {

        List<Schedule> scheduleList = new ArrayList<>();

        try {
            ResultSet rs = db.search(q);
            while (rs.next()) {
                Schedule schdule = new Schedule(rs.getInt("schedule_id"),
                        rs.getString("title"),
                        rs.getString("firstName") + " " + rs.getString("lastName"),
                        rs.getString("subjectName"),
                        rs.getString("gradeName"),
                        rs.getDate("date"),
                        rs.getString("endTime"),
                        rs.getString("startTime"));

                System.out.println(rs.getInt("schedule_id"));
                scheduleList.add(schdule);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return scheduleList;

    }

    public boolean addData(Schedule s) {

        boolean success;
        success=db.iud("INSERT INTO `schedule`(`title`,`grade`,`subject`,`teacherId`,`date`,`startTime`.`endTime`) "
                + "VALUES('" + s.getTitle() + "','" + s.getGrade() + "','" + s.getSubjectId() + "','" + s.getTeacherId() + "','" + s.getDate() + "','" + s.getStartTime() + "','" + s.getEndTime() + "')");
        return success;
    }

}
