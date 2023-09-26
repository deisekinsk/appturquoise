package com.appturquoise.school.controller;

import com.appturquoise.school.dto.StudentDTO;
import com.appturquoise.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity <List<StudentDTO>>findAllStudents(){
        return new ResponseEntity<List<StudentDTO>>(studentService.findAllStudents(),
                HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDTO>getStudentById(@PathVariable Long id){
        return new ResponseEntity<StudentDTO>(studentService.getStudentById(id),
                HttpStatus.OK);
    }
}
