package com.proj.saudemvp.controller;

import com.proj.saudemvp.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository remedioRepository;

    @GetMapping
    public ResponseEntity<?> getRemedio() {
        return ResponseEntity.ok(remedioRepository.findAll());
    }


}
