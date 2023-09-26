package com.appturquoise.school.service;

import com.appturquoise.school.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> findAllStudents();

    StudentDTO getStudentById(Long studentId);


}
