package com.proj.saudemvp.service;

import com.proj.saudemvp.model.Alergia;
import com.proj.saudemvp.repository.AlergiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlergiaService {

    @Autowired
    private AlergiaRepository alergiaRepository;

    public List<Alergia> getAlergias(){
        return alergiaRepository.findAll();
    }
}
