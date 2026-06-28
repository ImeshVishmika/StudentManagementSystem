/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Schedule {
    
    private int scheduleId;
    private String title;
    private int teacherId;
    private String teacher;
    private int subjectId;
    private String subject;
    private String grade;
    private Date date;
    private String endTime;
    private String startTime;

    public Schedule(int scheduleId, String title, String teacher, String subject, String grade, Date date, String endTime, String startTime) {
        this.scheduleId = scheduleId;
        this.title = title;
        this.teacher = teacher;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
        this.endTime = endTime;
        this.startTime = startTime;
    }
    
       public Schedule( String title, String teacher, String subject, String grade, Date date, String startTime , String endTime) {
        this.title = title;
        this.teacher = teacher;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    
    
}
