package com.proj.saudemvp.controller;

import com.proj.saudemvp.service.AlergiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/alergias")
public class AlergiaController {

    @Autowired
    private AlergiaService alergiaService;

    @GetMapping
    public ResponseEntity<?> getAlergias(){
        return ResponseEntity.ok(alergiaService.getAlergias());
    }
}
