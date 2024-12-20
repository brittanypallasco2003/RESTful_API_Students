package com.RESTful_API_Students.controllers;

import com.RESTful_API_Students.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(123, "Juan Lopéz", "juan@gmail.com", 18, "Algebra lineal"),
            new Student(124, "Enrique García", "enri@gmail", 19, "Estadística"),
            new Student(125, "Felipe García", "felipe@gmail", 23, "French"),
            new Student(126, "Daniel Flores", "dani@gmail", 24, "Computing")
    ));

    @GetMapping
    public List<Student> showStudents() {
        return students;
    }

    @GetMapping("/{email}")
    public Student showStudent(@PathVariable String email) {
        for (Student st : students) {
            if (st.getEmail().equalsIgnoreCase(email)) {
                return st;
            }
        }
        return null;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        for (Student st: students){
            if (st.getID()==student.getID()){
               st.setName(student.getName());
               st.setEmail(student.getEmail());
               st.setAge(student.getAge());
               st.setCourse(student.getCourse());
               return st;
            }
        }
        return null;
    }

    @PatchMapping
    public Student partialUpdateStudent(@RequestBody Student student){
        for (Student st: students){
            if (st.getID()==student.getID()){
                if (student.getName()!=null){
                st.setName(student.getName());
                }
                if (student.getAge()!=0){
                st.setAge(student.getAge());
                }
                if (student.getEmail()!=null){
                st.setEmail(student.getEmail());
                }
                if (student.getCourse()!=null){
                st.setCourse(student.getCourse());
                }
                return st;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable int id){
        for (Student st: students){
            if (id==st.getID()){
               students.remove(st);
               return st;
            }
        }
        return null;
    }

}
