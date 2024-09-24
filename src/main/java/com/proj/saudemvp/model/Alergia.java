package com.proj.saudemvp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ALERGIA")
public class Alergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "tipoAlergia", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TiposAlergia tipoAlergia;


    public Alergia(String nome, TiposAlergia tipoAlergia) {
        this.nome = nome;
        this.tipoAlergia = tipoAlergia;
    }

    public Alergia() {
    }
}
