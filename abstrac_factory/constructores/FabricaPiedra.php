<?php

require_once __DIR__ . '/fabricaEquipo.php';
require_once __DIR__ . '/../productos/Lanza_piedra.php';
require_once __DIR__ . '/../productos/Hacha_piedra.php';

class FabricaPiedra implements FabricaEquipo
{
    public function crearLanza(): Lanza
    {
        return new LanzaPiedra();
    }

    public function crearHacha(): Hacha
    {
        return new HachaPiedra();
    }
}