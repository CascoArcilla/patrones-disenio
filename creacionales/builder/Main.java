package com.ejemplotorta;

import com.ejemplotorta.chefs.ChefTortaEspecial;
import com.ejemplotorta.panes.Bolillo;
import com.ejemplotorta.rellenos.Jamon;
import com.ejemplotorta.picantes.Chipotle;
import com.ejemplotorta.picantes.Rajas;
import com.ejemplotorta.aderezos.Guacamole;
import com.ejemplotorta.aderezos.MayonesaChipotle;
import com.ejemplotorta.vegetales.Lechuga;
import com.ejemplotorta.vegetales.Tomate;
import com.ejemplotorta.vegetales.Cebolla;

public class Main {
    public static void main(String[] args) {
        ChefTortaEspecial chef = new ChefTortaEspecial();
        Vendedor vendedor = new Vendedor(chef);

        System.out.println("-- Pedido 1 --");
        System.out.println("Un cliente pide una torta del menu: Jamon");
        vendedor.hacerTortaJamonConTodo();
        Torta torta1 = chef.getTorta();
        System.out.println(torta1.toString());
        System.out.println("\n");

        System.out.println("-- Pedido 2 --");
        System.out.println("Otro cliente pide una torta del menu: Empanizada con salsa roja");
        vendedor.hacerTortaEmpanizadaConSalsaRoja();
        Torta torta2 = chef.getTorta();
        System.out.println(torta2.toString());
        System.out.println("\n");

        System.out.println("-- Pedido 3 --");
        System.out.println("Otro cliente pide una torta del menu: Huevo");
        vendedor.hacerTortaHuevo();
        Torta torta3 = chef.getTorta();
        System.out.println(torta3.toString());
        System.out.println("\n");

        System.out.println("-- Pedido 4 --");
        System.out.println("Otro cliente pide una torta personalizada: Una de Jamon, picantes chipotle y rajas, aderezo guacamole y mayonesa con chipotle, vegetales lechuga, tomate, cebolla");
        chef.resetTorta();
        chef.agregarPan(new Bolillo());
        chef.agregarRelleno(new Jamon());
        chef.agregarPicante(new Chipotle());
        chef.agregarPicante(new Rajas());
        chef.agregarAderezo(new Guacamole());
        chef.agregarAderezo(new MayonesaChipotle());
        chef.agregarVegetal(new Lechuga());
        chef.agregarVegetal(new Tomate());
        chef.agregarVegetal(new Cebolla());
        Torta torta4 = chef.getTorta();
        System.out.println(torta4.toString());
    }
}