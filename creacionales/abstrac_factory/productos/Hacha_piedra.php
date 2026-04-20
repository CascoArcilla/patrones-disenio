<?php

require_once 'Hacha.php';

class HachaPiedra implements Hacha
{
    private int $durabilidad;
    private int $efectividad;

    public function __construct()
    {
        $this->durabilidad = 20;
        $this->efectividad = 40;
    }

    public function usar(): void
    {
        echo "Usando hacha de piedra\n";
    }

    public function mostrarDurabilidad(): void
    {
        echo "Durabilidad de hacha de piedra: {$this->durabilidad}\n";
    }

    public function mostrarEfectividad(): void
    {
        echo "Efectividad de hacha de piedra: {$this->efectividad}\n";
    }
}