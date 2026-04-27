package com.prototype.tacos;

public class TacoCanasta extends TacoPrototype {
    public TacoCanasta(String relleno) { super("Maíz a mano", relleno); }
    public TacoCanasta(TacoCanasta target) { super(target); }

    @Override
    public TacoPrototype clonar() { return new TacoCanasta(this); }

    @Override
    public String toString() { return "Taco de Canasta [" + getRelleno() + "]"; }
}
