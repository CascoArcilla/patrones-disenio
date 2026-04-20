<?php

require_once __DIR__ . '/../espadas/fuego.php';
require_once __DIR__ . '/../espadas/espada.php';
require_once __DIR__ . '/creator.php';

// Creador concreto
class CreadorDeEspadaDeFuego extends Creador {
    private string $color_llama;

    public function __construct(string $color_llama) {
        $this->color_llama = $color_llama;
    }

    // Implementacion del metodo fabrica
    public function crearEspada(): Espada {
        return new EspadaDeFuego($this->color_llama);
    }
}