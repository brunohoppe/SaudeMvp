package com.proj.saudemvp.service;

import com.proj.saudemvp.model.Remedio;
import com.proj.saudemvp.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemedioService {

    @Autowired
    private RemedioRepository remedioRepository;

    public List<Remedio> getRemedios() {
        return remedioRepository.findAll();
    }
}
