package com.appturquoise.school.controller;

import com.appturquoise.school.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public ResponseEntity<Student> findAll(){
        Student s = new Student(1L, "Dita","Silva","dita_silva@gmail.com");
        return ResponseEntity.ok().body(s);
    }
}
