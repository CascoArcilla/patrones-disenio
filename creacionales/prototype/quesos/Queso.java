package com.prototype.quesos;

import com.prototype.Clonable;

public class Queso implements Clonable<Queso> {
    private String nombre;
    private String descripcion;
    public Queso(String nombre, String descripcion) { 
        this.nombre = nombre; 
        this.descripcion = descripcion;
    }

    public Queso(Queso queso) { 
        this.nombre = queso.getNombre(); 
        this.descripcion = queso.getDescripcion();
    }

    @Override
    public Queso clonar() { 
        return new Queso(this); 
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}