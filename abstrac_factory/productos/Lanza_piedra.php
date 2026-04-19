<?php

require_once 'Lanza.php';

class LanzaPiedra implements Lanza
{
    private int $daño;
    private int $velocidad;

    public function __construct()
    {
        $this->daño = 20;
        $this->velocidad = 40;
    }

    public function usar(): void
    {
        echo "Usando lanza de piedra\n";
    }

    public function mostrarAtaque(): void
    {
        echo "Daño de lanza de piedra: {$this->daño}\n";
    }

    public function mostrarVelocidad(): void
    {
        echo "Velocidad de lanza de piedra: {$this->velocidad}\n";
    }
}