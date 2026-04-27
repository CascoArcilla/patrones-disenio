package com.prototype.tacos;

public abstract class TacoPrototype {
    private String tipoTortilla;
    private String relleno;

    public TacoPrototype(String tipoTortilla, String relleno) {
        this.tipoTortilla = tipoTortilla;
        this.relleno = relleno;
    }

    public TacoPrototype(TacoPrototype target) {
        if (target != null) {
            this.tipoTortilla = target.getTipoTortilla();
            this.relleno = target.getRelleno();
        }
    }

    public String getTipoTortilla() { return tipoTortilla; }
    public void setTipoTortilla(String tipoTortilla) { this.tipoTortilla = tipoTortilla; }
    public String getRelleno() { return relleno; }
    public void setRelleno(String relleno) { this.relleno = relleno; }

    @Override
    public String toString() { return "Taco [Tortilla=" + tipoTortilla + ", Relleno=" + relleno + "]"; }

    public abstract TacoPrototype clonar();
}