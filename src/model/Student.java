/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String nic;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String gender;
    private List<Subject> subjects;
    
    public Student(String nic,String firstName,String lastName,String email,String gender,List<Subject> subjects){       
        this.nic=nic;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.gender=gender;   
        this.subjects=subjects;
    }

    public String getNic() {
        return nic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    
    public String getString(){
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
