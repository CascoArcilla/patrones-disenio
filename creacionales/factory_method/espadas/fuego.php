<?php

require_once 'espada.php';

// Producto concreto
class EspadaDeFuego implements Espada {
    private string $color_llama;

    public function __construct(string $color_llama) {
        $this->color_llama = $color_llama;
    }

    // Implementacion de los metodos de la interfaz
    public function golpear() {
        echo "Golpe de espada de fuego, fuuuuuf.\n";
    }

    public function cargarAtaque() {
        echo "Cargando espada de fuego, shhhhhhh.\n";
    }

    public function guardar() {
        echo "Guardando espada en su vaina.\n";
    }

    public function sacar() {
        echo "Espada de fuego desenvainada. La llama {$this->color_llama} brilla con fuerza.\n";
    }
}