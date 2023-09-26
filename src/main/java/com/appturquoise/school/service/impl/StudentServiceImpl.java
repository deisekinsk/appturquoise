package com.appturquoise.school.service.impl;

import com.appturquoise.school.dto.StudentDTO;
import com.appturquoise.school.model.Student;
import com.appturquoise.school.repository.StudentRepository;
import com.appturquoise.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private ModelMapper modelMapper;

    @Override
    public List<StudentDTO> findAllStudents() {
        List<Student> students= studentRepository.findAll();
        return students.stream().map((student) -> modelMapper.map(student, StudentDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).get();
        return modelMapper.map(student,StudentDTO.class);
    }
}
