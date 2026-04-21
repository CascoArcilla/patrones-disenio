package com.ejemplotorta;

import com.ejemplotorta.panes.Pan;
import com.ejemplotorta.rellenos.Relleno;
import com.ejemplotorta.picantes.Picante;
import com.ejemplotorta.aderezos.Aderezo;
import com.ejemplotorta.vegetales.Vegetal;
import java.util.ArrayList;

public class Torta {
    private Pan pan;
    private Relleno rellenoPrincipal;
    private ArrayList<Picante> picantes;
    private ArrayList<Aderezo> aderezos;
    private ArrayList<Vegetal> vegetales;

    public void setPan(Pan pan) { this.pan = pan; }

    public void setRellenoPrincipal(Relleno rellenoPrincipal) { this.rellenoPrincipal = rellenoPrincipal; }

    public void setPicantes(ArrayList<Picante> picantes) { this.picantes = picantes; }

    public void setAderezos(ArrayList<Aderezo> aderezos) { this.aderezos = aderezos; }

    public void setVegetales(ArrayList<Vegetal> vegetales) { this.vegetales = vegetales; }

    private String getPicantes() {
        if (this.picantes == null) return "";
        String picantes = "";
        for (Picante picante : this.picantes) {
            picantes += picante.getNombre() + ", ";
        }
        return picantes;
    }

    private String getAderezos() {
        if (this.aderezos == null) return "";
        String aderezos = "";
        for (Aderezo aderezo : this.aderezos) {
            aderezos += aderezo.getNombre() + ", ";
        }
        return aderezos;
    }

    private String getVegetales() {
        if (this.vegetales == null) return "";
        String vegetales = "";
        for (Vegetal vegetal : this.vegetales) {
            vegetales += vegetal.getNombre() + ", ";
        }
        return vegetales;
    }

    @Override
    public String toString() {
        return "Torta [pan=" + this.pan.getNombre() + ", rellenoPrincipal=" + this.rellenoPrincipal.getNombre() + ", picantes=" + this.getPicantes() + ", aderezos=" + this.getAderezos() + ", vegetales=" + this.getVegetales() + "]";
    }
}