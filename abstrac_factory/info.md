# Abstract Factory

## ¿Qué es? 🤔
Es un patrón de diseño creacional que permite crear familias de objetos relacionados sin especificar sus clases concretas.

## ¿Cuándo usarlo? 🎯

- Cuando tu código necesita crear familias de objetos relacionados.
- Cuando quieres evitar acoplar tu código a las clases concretas de los objetos.
- Cuando quieres poder cambiar la familia de objetos que se crean sin modificar el código.

## Ejecucion de ejemplo ⚔️
Para ejecutar el ejemplo, debes ejecutar el archivo main.php situado en este directorio con el comando:
```bash
php main.php
```
Recordar que para ejecutar php debes tenerlo instalado y configurado en el path.

## Explicación

- **Cliente**: Es la clase que utiliza la fábrica abstracta para crear objetos.
- **FabricaAbstracta**: Es la interfaz que define los métodos para crear objetos.
- **FabricaMadera**: Es una implementación de la fábrica abstracta que crea objetos de madera.
- **FabricaPiedra**: Es una implementación de la fábrica abstracta que crea objetos de piedra.
- **HachaAbstracta**: Es la interfaz que define los métodos para crear hachas.
- **HachaMadera**: Es una implementación de la interfaz hacha que crea hachas de madera.
- **HachaPiedra**: Es una implementación de la interfaz hacha que crea hachas de piedra.
- **LanzaAbstracta**: Es la interfaz que define los métodos para crear lanzas.
- **LanzaMadera**: Es una implementación de la interfaz lanza que crea lanzas de madera.
- **LanzaPiedra**: Es una implementación de la interfaz lanza que crea lanzas de piedra.

## Ventajas

- Permite crear familias de objetos relacionados sin especificar sus clases concretas.
- Evita acoplar tu código a las clases concretas de los objetos.
- Permite cambiar la familia de objetos que se crean sin modificar el código.

## Desventajas

- Puede ser un poco más complejo de implementar que otros patrones de diseño.
- Puede ser un poco más difícil de entender que otros patrones de diseño.

## Referencias

- [Refactoring Guru - Abstract Factory Pattern](https://refactoring.guru/es/design-patterns/abstract-factory)
- [Todocode - Video](https://youtu.be/AN53ccq2Syk?si=ZuDPCPFHEL5YqZ-W)
- [GeeksforGeeks - Abstract Factory Pattern](https://www.geeksforgeeks.org/system-design/abstract-factory-pattern/)