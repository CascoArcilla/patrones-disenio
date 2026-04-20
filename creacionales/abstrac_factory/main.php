<?php

require_once __DIR__ . '/Cliente.php';
require_once __DIR__ . '/constructores/FabricaMadera.php';
require_once __DIR__ . '/constructores/FabricaPiedra.php';

echo "--- Equipo de Madera ---\n";
echo "------------------------\n";
$cliente = new Cliente(new FabricaMadera());
$cliente->crearEquipo();
$cliente->usarEquipo();
$cliente->mostrarEquipo();

echo "\n--- Equipo de Piedra ---\n";
echo "------------------------\n";
$cliente = new Cliente(new FabricaPiedra());
$cliente->crearEquipo();
$cliente->usarEquipo();
$cliente->mostrarEquipo();

?>
