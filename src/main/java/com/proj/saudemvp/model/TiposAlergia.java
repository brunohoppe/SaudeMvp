package com.proj.saudemvp.model;

public enum TiposAlergia {
    RESPIRATORIA(1, "RESPIRATORIA"),
    CUTANEA(2, "CUTANEA"),
    ALIMENTAR(3, "ALIMENTAR"),
    MEDICAMENTOSA(4, "MEDICAMENTOSA"),
    OUTROS(5, "OUTROS");

    private int id;
    private String name;

    TiposAlergia(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
