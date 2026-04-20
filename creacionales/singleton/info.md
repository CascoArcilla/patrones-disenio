# Singleton

## ¿Qué es? 🤔
Singleton es un patrón de diseño creacional que asegura que una clase tenga una sola instancia y proporciona un punto de acceso global a ella.

## Descripción 💡
El patrón Singleton restringe la instanciación de una clase a un único objeto. Esto es útil cuando necesitas un único punto de acceso a un recurso compartido, como una base de datos o un archivo de configuración.

## Elementos 🧩
- Singleton: La clase que tiene una única instancia.
- Cliente: La clase que utiliza la instancia de Singleton (puede haber muchas).

## Analogia ⚔️
Imagina que tienes una base de datos y quieres que solo haya una instancia de la clase que se conecta a ella. En lugar de crear múltiples instancias de la clase de conexión, creas una única instancia y la compartes entre todos los clientes que necesitan acceder a la base de datos.

## Ejecucion de ejemplo
Debes ejecutar el archivo list_products.php con el comando (debes tener php instalado y configurado en el path):
```bash
php .\list_products.php
```

## ¿Cuándo usarlo? 🎯
- Cuando una clase debe tener una única instancia.
- Cuando necesitas un único punto de acceso a un recurso compartido.
- Cuando quieres evitar la creación de múltiples instancias de una clase.

## Ventajas ✅
- Asegura que una clase tenga una única instancia.
- Proporciona un punto de acceso global a un recurso compartido.
- Evita la creación de múltiples instancias de una clase.

## Desventajas ❌
- Puede ser más complejo que la instanciación directa.
- Puede ser más difícil de depurar.
- Puede violar el principio de responsabilidad única.

## Referencias
- [Refactoring Guru - Singleton Pattern](https://refactoring.guru/es/design-patterns/singleton)
- [Todocode - Video](https://www.youtube.com/watch?v=UekxC1hvurk&t=20s)