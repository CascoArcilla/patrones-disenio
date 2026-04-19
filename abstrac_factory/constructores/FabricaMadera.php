<?php

require_once 'FabricaEquipo.php';
require_once __DIR__ . '/../productos/Hacha_madera.php';
require_once __DIR__ . '/../productos/Lanza_madera.php';

class FabricaMadera implements FabricaEquipo
{
    public function crearLanza(): Lanza
    {
        return new LanzaMadera();
    }

    public function crearHacha(): Hacha
    {
        return new HachaMadera();
    }
}