package com.prototype.tacos;

import com.prototype.quesos.Queso;
import com.prototype.picantes.Picante;

public class TacoDeQuesoPicante extends TacoDeQueso {
    private Picante picante;

    public TacoDeQuesoPicante(String tipoTortilla, Queso tipoQueso, Picante picante) {
        super(tipoTortilla, tipoQueso);
        this.picante = picante;
    }

    public TacoDeQuesoPicante(TacoDeQuesoPicante target) {
        super(target);
        if (target != null) {
            this.picante = target.picante.clonar();
        }
    }

    @Override
    public TacoPrototype clonar() { return new TacoDeQuesoPicante(this); }

    public String getPicante() { return picante.getNombre(); }

    public void setPicante(Picante picante) {
        this.picante = picante;
    }

    @Override
    public String toString() {
        return "Taco de Queso Picante [" + getTipoTortilla() + ", Queso=" + getTipoQueso() + ", Picante=" + picante.getNombre() + "]";
    }
}