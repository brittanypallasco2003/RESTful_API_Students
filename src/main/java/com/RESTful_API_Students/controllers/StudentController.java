package com.RESTful_API_Students.controllers;

import com.RESTful_API_Students.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    List <Student> students= new ArrayList<>(Arrays.asList(
            new Student(123,"Juan Lopéz","juan@gmail.com", 18, "Algebra lineal"),
            new Student(124, "Enrique García", "enri@gmail",19, "Estadística"),
            new Student(124, "Felipe García", "felipe@gmail",19, ""),
            new Student(124, "Daniel Flores", "dani@gmail",19, "")
    ));


}
