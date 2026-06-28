/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 *
 * @author USER
 */
public class Teacher {
    private String nic;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private List<Subject> subjectList;

    public Teacher(String nic, String firstName,String lastName, String email, String gender,List<Subject> subjectList) {
        this.nic = nic;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.subjectList = subjectList;  
    }

    public String getNic() {
        return nic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

   
    
    
}
