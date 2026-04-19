<?php

class Cliente {
    private Creador $creador;

    public function __construct(Creador $creador) {
        $this->creador = $creador;
    }

    public function usarEspada(): void {
        $espada = $this->creador->crearEspada();
        $espada->sacar();
        $espada->cargarAtaque();
        $espada->golpear();
        $espada->guardar();
    }
}