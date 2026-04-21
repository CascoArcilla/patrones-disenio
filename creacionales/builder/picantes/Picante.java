package com.ejemplotorta.picantes;

public abstract class Picante {
    String nombre;

    public Picante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}