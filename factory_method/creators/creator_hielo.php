<?php

require_once __DIR__ . '/creator.php';
require_once __DIR__ . '/../espadas/hielo.php';
require_once __DIR__ . '/../espadas/espada.php';

// Creador concreto
class CreadorDeEspadaDeHielo extends Creador {
    // Implementacion del metodo de fabrica
    public function crearEspada(): Espada {
        return new EspadaDeHielo();
    }
}