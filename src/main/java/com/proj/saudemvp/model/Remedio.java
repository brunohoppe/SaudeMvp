package com.proj.saudemvp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REMEDIO")
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 100)
    private String sobrenome;

    public Remedio(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Remedio() {
    }


}
