<?php

require_once 'espada.php';

// Producto concreto
class EspadaDeHielo implements Espada {
    
    // Implementacion de los metodos de la interfaz
    public function golpear() {
        echo "Golpe de espada de hielo, brrrrrrr.\n";
    }

    public function cargarAtaque() {
        echo "Cargando espada de hielo, brrrrrrr.\n";
    }

    public function guardar() {
        echo "Guardando espada de hielo\n";
    }

    public function sacar() {
        echo "Espada de hielo desenvainada.\n";
    }
}