<?php

require_once 'espada.php';

// Producto concreto
class EspadaDeRayo implements Espada {
    private int $voltaje;

    public function __construct(int $voltaje) {
        $this->voltaje = $voltaje;
    }

    // Implementacion de los metodos de la interfaz
    public function golpear() {
        echo "Golpe de espada de rayo, crashhhhh. Esos {$this->voltaje} voltios hacen temblar la tierra.\n";
    }

    public function cargarAtaque() {
        echo "Cargando ataque de espada de rayo, iuuuuu. El rayo se acumula en la punta de la espada.\n";
    }

    public function guardar() {
        echo "Espada de rayo se oculta en su mango. El rayo se disipa lentamente.\n";
    }

    public function sacar() {
        echo "Espada de rayo sacada crece de su mango. El rayo envuelve la espada.\n";
    }
}