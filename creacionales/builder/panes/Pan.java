package com.ejemplotorta.panes;

public abstract class Pan {
    String nombre;

    public Pan(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}