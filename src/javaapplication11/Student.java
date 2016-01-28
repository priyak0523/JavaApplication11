/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author HACKER
 */
public class Student 
{
    String name;
    String id;
    String gender;
    double grade;

    public Student() {
        name = "";
        id = "";
        gender="";
        grade=0.0;
    }

    
    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object s){
        if(s instanceof Student){
            Student thatP = (Student) s;
            return (thatP.getName().equals(name) && thatP.getId().equals(id));
        }
        else{
            return false;
        }
        
    }
            
    @Override
    public String toString(){
         return "{ \"name\" : \"" + name + "\" "
                + "\"id\" : \"" + id + "\""
                + "\"gender\" : \"" + gender + "\""
                + "\"grade\" : \"" + grade + "\""
                + "}";

    }
}
