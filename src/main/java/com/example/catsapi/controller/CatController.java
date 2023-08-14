package com.example.catsapi.controller;

import com.example.catsapi.DTO.CatDTO;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDTO catDTO) {
        return catService.save(catDTO);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
