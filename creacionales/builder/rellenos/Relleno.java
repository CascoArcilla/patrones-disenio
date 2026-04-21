package com.ejemplotorta.rellenos;

public abstract class Relleno {
    String nombre;

    public Relleno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}