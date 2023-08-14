package com.example.catsapi.service;

import com.example.catsapi.DTO.CatDTO;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDTO catDTO) {
        Cat cat = new Cat()
                .setName(catDTO.getName())
                .setBirthDay(catDTO.getBirthDay())
                .setCreatedAt(LocalDateTime.now());

        cat = catRepository.save(cat);
        return cat;
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
