package com.ejemplotorta.aderezos;

public abstract class Aderezo {
    private String nombre;

    public Aderezo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}