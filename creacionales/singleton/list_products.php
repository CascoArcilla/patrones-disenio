<?php

require_once "data_base.php";

echo "Listando todos los productos\n";
$dataBase = DataBase::getInstance();
$dataBase->executeQuery("SELECT * FROM products LIMIT 10;");

echo "\nListando productos de la categoria electronicos\n";
$dataBase2 = DataBase::getInstance();
$dataBase2->executeQuery("SELECT * FROM products LIMIT 10 WHERE category = 'electronics';");

echo "\nListando productos de la categoria ropa\n";
$dataBase3 = DataBase::getInstance();
$dataBase3->executeQuery("SELECT * FROM products LIMIT 10 WHERE category = 'ropa';");

echo "\nVerificando si las instancias son iguales\n";
var_dump($dataBase === $dataBase2 && $dataBase2 === $dataBase3);
