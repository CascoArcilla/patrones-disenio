<?php

require_once __DIR__ . '/creators/creator_fire.php';
require_once __DIR__ . '/creators/creator_hielo.php';
require_once __DIR__ . '/creators/creator_rayo.php';
require_once __DIR__ . '/cliente.php';

// Instanciamos el creador de espadas de fuego
$cliente1 = new Cliente(new CreadorDeEspadaDeFuego("azul"));

// Usamos el creador para crear y usar la espada de fuego
echo "-- Flujo para la espada de fuego --\n";
echo "------------------------------------\n";
$cliente1->usarEspada();

echo "\n-- Flujo para la espada de hielo --\n";
echo "------------------------------------\n";
$cliente2 = new Cliente(new CreadorDeEspadaDeHielo());
$cliente2->usarEspada();

echo "\n-- Flujo para la espada de rayo --\n";
echo "------------------------------------\n";
$cliente3 = new Cliente(new CreadorDeEspadaDeRayo(1000));
$cliente3->usarEspada();
