<?php

require_once 'Lanza.php';

class LanzaMadera implements Lanza
{
    private int $daño;
    private int $velocidad;

    public function __construct()
    {
        $this->daño = 10;
        $this->velocidad = 20;
    }

    public function usar(): void
    {
        echo "Usando lanza de madera\n";
    }

    public function mostrarAtaque(): void
    {
        echo "Ataque de lanza de madera: {$this->daño}\n";
    }

    public function mostrarVelocidad(): void
    {
        echo "Velocidad de lanza de madera: {$this->velocidad}\n";
    }
}