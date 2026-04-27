package com.prototype.actores;

import com.prototype.tacos.TacoPrototype;
import java.util.ArrayList;

public class Consumidor {
    private String nombre;
    private ArrayList<TacoPrototype> tacos;

    public Consumidor() {
        this.nombre = "Pablo";
        this.tacos = new ArrayList<TacoPrototype>();
    }

    public Consumidor(String nombre) {
        this.nombre = nombre;
        this.tacos = new ArrayList<TacoPrototype>();
    }

    public void agregarTaco(TacoPrototype taco) {
        this.tacos.add(taco);
    }

    public void comerTacos() {
        System.out.println("\nEmpiezo a comer los tacos\n");
        for (TacoPrototype taco : tacos) {
            // Probabilidad de un 40% de que el taco se caiga y no se coma
            if (Math.random() * 100 < 40) {
                System.out.println("El taco " + taco.toString() + " se cayo\n");
                continue;
            }

            System.out.println("Niam niam, estoy comiendo " + taco.toString() + "\n");
        }

        // Probabilidad de un 30% de que me de diarrea por comer tantos tacos
        if (Math.random() * 100 < 50) {
            System.out.println("¡Ay! Me dio diarrea por comer tantos tacos\n");
            System.out.println("Pero todos los tacos estaban deliciosos :)\n");
        } else {
            System.out.println("Todos los tacos estaban deliciosos :)\n");
        }
    }

    public void mostrarPedido() {
        System.out.println("\n=== PEDIDO DE " + nombre + " ===");
        if (tacos.isEmpty()) {
            System.out.println("No hay tacos en este pedido.");
        } else {
            for (TacoPrototype taco : tacos) {
                System.out.println(taco.toString());
            }
        }
    }

    public String getNombre() { return this.nombre; }
}
