<?php

require_once __DIR__ . '/../productos/Lanza.php';
require_once __DIR__ . '/../productos/Hacha.php';

interface FabricaEquipo
{
    public function crearLanza(): Lanza;
    public function crearHacha(): Hacha;
}