package com.ejemplotorta.chefs;

import com.ejemplotorta.Torta;
import com.ejemplotorta.panes.Pan;
import com.ejemplotorta.picantes.Picante;
import com.ejemplotorta.aderezos.Aderezo;
import com.ejemplotorta.vegetales.Vegetal;
import com.ejemplotorta.rellenos.Relleno;
import java.util.ArrayList;

// Builder concreto
public class ChefTortaEspecial implements Chef {
    private Torta torta;
    private ArrayList<Picante> picantes;
    private ArrayList<Aderezo> aderezos;
    private ArrayList<Vegetal> vegetales;

    @Override
    public void resetTorta() { 
        this.torta = new Torta();
        this.picantes = new ArrayList<Picante>();
        this.aderezos = new ArrayList<Aderezo>();
        this.vegetales = new ArrayList<Vegetal>();
    }

    @Override
    public void agregarPan(Pan pan) { torta.setPan(pan); }

    @Override
    public void agregarRelleno(Relleno relleno) { torta.setRellenoPrincipal(relleno); }

    @Override
    public void agregarPicante(Picante picante) { 
        this.picantes.add(picante);
        torta.setPicantes(this.picantes); 
    }

    @Override
    public void agregarAderezo(Aderezo aderezo) { 
        this.aderezos.add(aderezo);
        torta.setAderezos(this.aderezos); 
    }

    @Override
    public void agregarVegetal(Vegetal vegetal) { 
        this.vegetales.add(vegetal);
        torta.setVegetales(this.vegetales); 
    }

    public Torta getTorta() { return torta; }
}
