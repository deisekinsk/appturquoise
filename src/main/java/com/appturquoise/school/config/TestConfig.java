package com.appturquoise.school.config;

import com.appturquoise.school.model.Student;
import com.appturquoise.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception{
        Student s1 = new Student(null, "Dita","Silva","dita_silva@gmail.com");
        Student s2 = new Student(null, "Moro","Silva","moro_silva@gmail.com");

        studentRepository.saveAll(Arrays.asList(s1, s2));

    }

}
