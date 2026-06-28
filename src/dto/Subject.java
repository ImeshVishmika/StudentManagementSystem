/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import model.*;

/**
 *
 * @author USER
 */
public class Subject {
    
    private String subjectName;
    private String grade;
    private String teachersName;
    private String teacherSubID;
    
    public Subject(String subjectName,String grade,String teachersName,String teacherSubID){
        this.subjectName=subjectName;
        this.grade=grade;
        this.teachersName=teachersName;
        this.teacherSubID=teacherSubID;
    }
    
    public Subject(String subjectName,String grade){
        this.subjectName=subjectName;
        this.grade=grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getGrade() {
        return grade;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public String getTeacherSubID() {
        return teacherSubID;
    }
    
    @Override
    public String toString(){
        return subjectName;
    }
    
    
}
