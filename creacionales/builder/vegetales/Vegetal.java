package com.ejemplotorta.vegetales;

public abstract class Vegetal {
    private String nombre;

    public Vegetal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}