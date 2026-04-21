# Builder

## ¿Qué es? 🤔
El **Builder** es un patrón de diseño creacional que ayuda a construir objetos complejos paso a paso. Permite crear diferentes representaciones de un mismo objeto sin cambiar su estructura. En mi opinion, es un patron más sencillo de comprender que abstrac factory o factory method.

## ¿Cuándo usarlo? 🎯

- Cuando necesitas construir un objeto complejo con muchos parámetros
- Cuando quieres crear diferentes representaciones de un mismo objeto
- Cuando quieres crear un objeto paso a paso

## Elementos 🧩

- **Builder**: Define la interfaz para crear las partes de un objeto complejo.
- **ConcreteBuilder**: Implementa la interfaz Builder y construye un objeto complejo.
- **Product**: Es el objeto complejo que se construye.
- **Director**: Es el que construye el objeto complejo.
- **Cliente**: Quien hace las instancias del director y los concreteBuilder.

## Analogia y Ejemplo 👨‍🍳

Para este ejemplo considera lo siguiete: <br>
Imagina que quieres hacer una torta, que seria el **Product**. En México, una torta es un tipo de sandwich que requiere de varios ingredientes y preparaciones. Represento al **Builder** como un chef, el cual debe saber como preparar la torta y a un chef que prepara tortas como el **ConcreteBuilder**. El vendedor sera quien le diga al chef como preparar la torta **(Director)**

Por lo tanto, para este ejemplo de la torta, los elementos son: <br>

- **Builder**: `Chef` (en `chefs/Chef.java`)
- **ConcreteBuilder**: `ChefTortaEspecial` (en `chefs/ChefTortaEspecial.java`)
- **Product**: `Torta` (en `./Torta.java`)
- **Director**: `Vendedor` (en `./Vendedor.java`)
- **Cliente**: `Main` (en `./Main.java`)

## Ejecucion de ejemplo ⚔️
Esto esta pensado para Linux, si usas Windows (mi caso en estos momentos) puedes usar el git bash para ejecutar los comandos.<br>
Para ejecutar el ejemplo, debes compilar los .java situados en este directorio con el comando:
```bash
javac -d . @sources.txt
```
Lo anterior crea la estructura de carpetas y los .class dentro de ellas, luego ejecutar el Main.class dentro del directorio com/ejemplotorta con el comando:
```bash
java com.ejemplotorta.Main
```
**Nota**: Este ultimo comando es para el directorio raiz para este patron.

## Referencias

- [Refactoring Guru - Builder Pattern](https://refactoring.guru/es/design-patterns/builder)
- [Todocode - Video](https://youtu.be/cXlhMjzLZBI?si=AS-sK9YfxM3_hxHA)
- [GeeksforGeeks - Builder Pattern](https://www.geeksforgeeks.org/system-design/builder-pattern/)