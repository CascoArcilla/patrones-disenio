package com.prototype.tacos;

import com.prototype.quesos.Queso;

public class TacoDeQueso extends TacoPrototype {
    private Queso tipoQueso;

    public TacoDeQueso(String tipoTortilla, Queso tipoQueso) {
        super(tipoTortilla, "Queso");
        this.tipoQueso = tipoQueso;
    }

    public TacoDeQueso(TacoDeQueso target) {
        super(target);
        if (target != null) this.tipoQueso = target.tipoQueso.clonar();
    }

    public String getTipoQueso() { return tipoQueso.getNombre(); }
    public void setTipoQueso(Queso queso) { this.tipoQueso = queso; }

    @Override
    public TacoPrototype clonar() { return new TacoDeQueso(this); }

    @Override
    public String toString() {
        return "Taco de Queso [" + getTipoTortilla() + ", Queso=" + tipoQueso.getNombre() + "]";
    }
}
