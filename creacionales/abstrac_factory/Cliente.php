<?php

require_once __DIR__ . '/constructores/fabricaEquipo.php';
require_once __DIR__ . '/productos/Lanza.php';
require_once __DIR__ . '/productos/hacha.php';

class Cliente {
    private FabricaEquipo $fabrica;
    private Lanza $lanza;
    private Hacha $hacha;

    public function __construct(FabricaEquipo $fabrica)
    {
        $this->fabrica = $fabrica;
    }

    public function crearEquipo(): void {
        $this->lanza = $this->fabrica->crearLanza();
        $this->hacha = $this->fabrica->crearHacha();
    }

    public function usarEquipo(): void {
        $this->lanza->usar();
        $this->hacha->usar();
    }

    public function mostrarEquipo(): void {
        echo "\n--- Hacha ---\n";
        $this->hacha->mostrarDurabilidad();
        $this->hacha->mostrarEfectividad();

        echo "\n--- Lanza ---\n";
        $this->lanza->mostrarVelocidad();
        $this->lanza->mostrarAtaque();
    }
}
