/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Teacher {
    private String nic;
    private String name;
    private String email;
    private String gender;
    private String subject;

    public Teacher(String nic, String name, String email, String gender) {
        this.nic = nic;
        this.name = name;
        this.email = email;
        this.gender = gender;
       
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getSubject() {
        return subject;
    }
    
    
}
