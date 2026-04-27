package com.prototype;

import com.prototype.actores.Consumidor;

import com.prototype.tacos.TacoPrototype;
import com.prototype.tacos.TacoCanasta;
import com.prototype.tacos.TacoDeQueso;
import com.prototype.tacos.TacoDeQuesoPicante;

import com.prototype.quesos.QuesoOaxaca;
import com.prototype.quesos.QuesoFresco;

import com.prototype.picantes.Chipotle;
import com.prototype.picantes.Rajas;

public class PuestoTacos {
    public static void main(String[] args) {
        System.out.println("=== PUESTO DE TACOS ===");
        Consumidor pablo = new Consumidor();
        System.out.println("El consumidor " + pablo.getNombre() + " ha hecho varios pedidos.");

        TacoPrototype tacoCanasta1 = new TacoCanasta("Guisado de chicharron");
        tacoCanasta1.setTipoTortilla("Tortilla maquina");
        pablo.agregarTaco(tacoCanasta1);

        TacoPrototype tacoCanasta2 = tacoCanasta1.clonar();
        tacoCanasta1.setTipoTortilla("Tortilla de harina");
        tacoCanasta2.setRelleno("Guisado de papa");
        pablo.agregarTaco(tacoCanasta2);

        TacoDeQueso tacoQueso1 = new TacoDeQueso("Maiz", new QuesoOaxaca());
        tacoQueso1.setTipoTortilla("Tortilla de maquina");
        pablo.agregarTaco(tacoQueso1);

        TacoDeQueso tacoQueso2 = (TacoDeQueso) tacoQueso1.clonar();
        tacoQueso2.setTipoQueso(new QuesoFresco());
        pablo.agregarTaco(tacoQueso2);

        TacoDeQuesoPicante tacoQuesoPicante1 = new TacoDeQuesoPicante("Maiz", new QuesoOaxaca(), new Chipotle());
        tacoQuesoPicante1.setTipoTortilla("Tortilla de maquina");
        pablo.agregarTaco(tacoQuesoPicante1);

        TacoDeQuesoPicante tacoQuesoPicante2 = (TacoDeQuesoPicante) tacoQuesoPicante1.clonar();
        tacoQuesoPicante2.setTipoTortilla("Tortilla de maiz a mano");
        tacoQuesoPicante2.setTipoQueso(new QuesoFresco());
        tacoQuesoPicante2.setPicante(new Rajas());
        pablo.agregarTaco(tacoQuesoPicante2);

        TacoDeQuesoPicante tacoQuesoPicante3 = (TacoDeQuesoPicante) tacoQuesoPicante1.clonar();
        tacoQuesoPicante3.setTipoQueso(new QuesoOaxaca());
        tacoQuesoPicante3.setPicante(new Rajas());
        pablo.agregarTaco(tacoQuesoPicante3);

        pablo.mostrarPedido();
        pablo.comerTacos();
    }
}