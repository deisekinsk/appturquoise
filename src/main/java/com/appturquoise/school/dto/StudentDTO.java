package com.appturquoise.school.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDTO {
    private Long id;
    private String firsName;
    private String lastName;
    private String email;

}
