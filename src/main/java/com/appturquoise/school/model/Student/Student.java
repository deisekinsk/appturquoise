package com.appturquoise.school.model.Student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Gera getters e Setters
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_green")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;
    @Column(name = "first_name")
    private String firsName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
