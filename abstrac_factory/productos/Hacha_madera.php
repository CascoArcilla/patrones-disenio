<?php

require_once 'Hacha.php';

class HachaMadera implements Hacha
{
    private int $durabilidad;
    private int $efectividad;

    public function __construct()
    {
        $this->durabilidad = 10;
        $this->efectividad = 20;
    }

    public function usar(): void
    {
        echo "Usando hacha de madera\n";
    }

    public function mostrarDurabilidad(): void
    {
        echo "Durabilidad de hacha de madera: {$this->durabilidad}\n";
    }

    public function mostrarEfectividad(): void
    {
        echo "Efectividad de hacha de madera: {$this->efectividad}\n";
    }
}