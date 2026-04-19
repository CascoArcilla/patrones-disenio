<?php
// Este es solo un ejemplo simple de como funciona el patron singleton
// No es una implementacion
class DataBase
{
    private static $instance;

    private function __construct()
    {
        echo "Conexion a la base de datos\n";
        return;
    }

    public static function getInstance()
    {
        if (self::$instance === null) {
            self::$instance = new DataBase();
        }
        return self::$instance;
    }

    public function executeQuery($query)
    {
        echo "Ejecutando la query: " . $query . "\n";
        return;
    }
}
