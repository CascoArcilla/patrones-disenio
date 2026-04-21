package com.ejemplotorta;

import com.ejemplotorta.Torta;
import com.ejemplotorta.chefs.Chef;
import com.ejemplotorta.panes.Bolillo;
import com.ejemplotorta.panes.Telera;
import com.ejemplotorta.rellenos.Jamon;
import com.ejemplotorta.rellenos.Huevo;
import com.ejemplotorta.rellenos.Empanizado;
import com.ejemplotorta.picantes.Rajas;
import com.ejemplotorta.picantes.Chipotle;
import com.ejemplotorta.picantes.SalsaVerde;
import com.ejemplotorta.picantes.SalsaRoja;
import com.ejemplotorta.aderezos.Mayonesa;
import com.ejemplotorta.aderezos.Guacamole;
import com.ejemplotorta.vegetales.Lechuga;
import com.ejemplotorta.vegetales.Tomate;
import com.ejemplotorta.vegetales.Cebolla;

public class Vendedor {
    private Chef chef;

    public Vendedor(Chef chef) { this.chef = chef; }

    public void setChef(Chef chef) { this.chef = chef; }

    public void hacerTortaJamonConTodo() { 
        chef.resetTorta();
        chef.agregarPan(new Bolillo());
        chef.agregarRelleno(new Jamon());
        chef.agregarPicante(new Rajas());

        chef.agregarAderezo(new Mayonesa());
        chef.agregarAderezo(new Guacamole());

        chef.agregarVegetal(new Lechuga());
        chef.agregarVegetal(new Tomate());
        chef.agregarVegetal(new Cebolla());
    }

    public void hacerTortaEmpanizadaConSalsaRoja() { 
        chef.resetTorta();
        chef.agregarPan(new Telera());
        chef.agregarRelleno(new Empanizado());
        chef.agregarPicante(new SalsaRoja());
        chef.agregarAderezo(new Mayonesa());
        chef.agregarVegetal(new Lechuga());
        chef.agregarVegetal(new Tomate());
    }

    public void hacerTortaHuevo(){
        chef.resetTorta();
        chef.agregarPan(new Bolillo());
        chef.agregarRelleno(new Huevo());
        chef.agregarPicante(new Chipotle());
        chef.agregarPicante(new SalsaVerde());
    }
}