package com.example.catsapi.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDTO {
    private String name;
    private LocalDate birthDay;
}
