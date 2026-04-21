package com.ejemplotorta.chefs;

import com.ejemplotorta.panes.Pan;
import com.ejemplotorta.rellenos.Relleno;
import com.ejemplotorta.picantes.Picante;
import com.ejemplotorta.aderezos.Aderezo;
import com.ejemplotorta.vegetales.Vegetal;
import com.ejemplotorta.Torta;

public interface Chef {
    public void agregarPan(Pan pan);
    public void agregarRelleno(Relleno relleno);
    public void agregarPicante(Picante picante);
    public void agregarAderezo(Aderezo aderezo);
    public void agregarVegetal(Vegetal vegetal);
    public void resetTorta();
}