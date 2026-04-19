# Factory Method

## ¿Qué es? 🤔
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán. <br>

## Descripción 💡
El patrón Factory Method define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. Factory Method permite que una clase delegue la responsabilidad de la instanciación a las subclases.

## Elementos 🧩
- **Producto**: Define la interfaz para los objetos que crea el patrón.
- **Producto Concreto**: Implementa la interfaz producto (clases que se van a instanciar).
- **Creador**: Declara el método de fábrica que devuelve instancias de productos.
- **Creador Concreto**: Implementa el método abstracto del creador para instanciar productos concretos.
- **Cliente**: Usa el método de fábrica para instanciar productos.

## Ejecucion de ejemplo
Para ejecutar el ejemplo, debes ejecutar el archivo main.php situado en este directorio con el comando:
```bash
php main.php
```
Recordar que para ejecutar php debes tenerlo instalado y configurado en el path.

## Explicación y Analogía del ejemplo ⚔️
Imagina que alguien debe crear y usar espadas. Pero no sabes que tipo de espada usará (puede ser espada de fuego, espada de hielo, espada de rayo, etc.), sin embargo si sabes que debe hacer la espada (atacar, defender, etc.), entonces defines una interfaz (producto) para definir las funciones que debe tener la espada, y luego creas clases que implementen esa interfaz para crear cada tipo de espada (productos concretos). <br>

El punto de este patron es que el cliente no sabe que tipo de espada usará, solo sabe que debe usar una espada. Para ello creas un Creador (clase abstracta) que será la fabrica, y dentro de ella defines un metodo abstracto que retorne instancias de espadas (usando la interfaz producto). A partir de esta clase abstracta, creas clases que implementen ese metodo para crear cada tipo de espada (creadores concretos). <br>

El cliente (quien usa el creador) solo interactua con la clase abstracta Creador y con el producto (espada), por lo que no sabe que tipo de espada usará, solo sabe que la instancia recibida tendra un metodo que le permitira obtener una instancia de una espada y usarla. <br>

## ¿Cuándo usarlo? 🎯
- Cuando una clase no puede anticipar el tipo de objetos que debe crear.
- Cuando una clase quiere delegar la responsabilidad de la instanciación a las subclases.
- Cuando una clase quiere proporcionar una interfaz para crear objetos, pero deja que las subclases decidan qué clase instanciar.

## Ventajas ✅
- Desacopla la creación de objetos de su uso.
- Permite que las subclases alteren el tipo de objetos que se crearán.
- Proporciona una interfaz para crear objetos, pero deja que las subclases decidan qué clase instanciar.

## Desventajas ❌
- Puede ser más complejo que la instanciación directa.
- Puede ser más difícil de depurar.

## Referencias
- [Refactoring Guru - Factory Method Pattern](https://refactoring.guru/es/design-patterns/factory-method)
- [Todocode - Video](https://www.youtube.com/watch?v=iPkq6s7nrus&t=20s)
