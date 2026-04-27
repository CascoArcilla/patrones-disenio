package com.prototype.picantes;

import com.prototype.Clonable;

public class Picante implements Clonable<Picante> {
    private String nombre;
    private String descripcion;

    public Picante(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Picante(Picante picante) {
        this.nombre = picante.getNombre();
        this.descripcion = picante.getDescripcion();
    }

    @Override
    public Picante clonar() { return new Picante(this); }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}