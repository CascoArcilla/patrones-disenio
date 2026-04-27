package com.prototype;

/**
 * @brief Interfaz que define la operacion para clonar objetos.
 * @param <T> Tipo de objeto que se va a clonar.
 */
public interface Clonable<T> {
    /**
     * @brief Crea una copia exacta (o modificada) del objeto.
     * @return Una copia del objeto.
     */
    T clonar();
}