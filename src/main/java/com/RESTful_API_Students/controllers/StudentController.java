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


}
