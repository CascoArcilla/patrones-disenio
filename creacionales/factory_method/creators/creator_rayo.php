<?php

require_once __DIR__ . '/creator.php';
require_once __DIR__ . '/../espadas/rayo.php';
require_once __DIR__ . '/../espadas/espada.php';

// Creador concreto
class CreadorDeEspadaDeRayo extends Creador {
    private int $voltaje;

    public function __construct(int $voltaje) {
        $this->voltaje = $voltaje;
    }

    // Implementacion del metodo de fabrica
    public function crearEspada(): Espada {
        return new EspadaDeRayo($this->voltaje);
    }
}