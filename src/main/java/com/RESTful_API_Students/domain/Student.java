package com.RESTful_API_Students.domain;

public class Student {

    //Attributes
    private int ID;
    private String name;
    private String email;
    private int age;
    private String course;

    //Constructor
    public Student(int ID, String name, String email, int age, String course){
        this.ID=ID;
        this.name=name;
        this.email=email;
        this.age=age;
        this.course=course;
    }

    // Getter and Setter Methods
    public int getID() {
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
