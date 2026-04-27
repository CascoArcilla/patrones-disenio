# Prototype

## Definición 🤔
Prototipo (otro patron de diseño creacional) permite clonar objetos existentes, en lugar de crearlos desde cero mediante constructores. Crear copias exactas (o modificadas) de objetos sin necesidad de conocer sus detalles de construcción.

## Características 🌟

- Los objetos son pesados o complejos de crear
- Los objetos son costosos de inicializar
- Se necesitan muchas variaciones del mismo objeto
- Se quiere evitar la complejidad de los constructores

## ¿Cuando usarlo? 🎯
- Cuando no queremos inicializar un objeto desde cero.
- Cuando los objetos son pesados o complejos de crear.
- Cuando los objetos son costosos de inicializar.
- Se necesitan muchas variaciones del mismo objeto.
- Se quiere evitar la complejidad de los constructores.

## Elementos 🧩

1. **Prototipo** (Interfaz o Clase Abstracta): Declara una operacion para clonar objetos.
2. **Clonacion**: Es el metodo que implementa la operacion de clonacion, generalmente un metodo clone().
3. **Prototipo Concreto**: Implementa la interfaz o clase abstracta y el metodo clonar() del prototipo.
4. **Cliente**: Utiliza el prototipo para clonar objetos

### Extras 🛠️

- **Registro de Prototipos (Prototype Registry)**: Es un almacen centralizado de prototipos que permite registrarlos y recuperarlos por un identificador. Es útil para gestionar un conjunto de prototipos de forma organizada.
- **Clonacion superficial vs profunda**:
    - **Superficial**: Copia las referencias a los objetos internos. Si el objeto interno cambia, el clon tambien cambiara.
    - **Profunda**: Copia todos los objetos internos recursivamente. Si el objeto interno cambia, el clon no cambiara.

## Analogia del ejemplo 👨‍🍳

En este ejemplo, tenemos un puesto de tacos donde se preparan diferentes tipos de tacos. Los tacos en un inicio tienen el tipo de torilla y el relleno (**Prototipo** representada por clase abstracta `TacoPrototype`). Hay tacos de canasta con torilla de maiz suave por defecto, el relleno se pasa por el constructor (**Prototipo concreto** que implementa la operacion clone() `TacoCanasta`). Otro tipo de taco que es taco de queso (`TacoDeQueso`) y taco de queso con picante (`TacoDeQuesoPicante`). En el "main" podemos ver como se utilizan estos prototipos para crear diferentes tipos de tacos (`PuestoDeTacos`).

Con lo anterior tenemos entonces lo siguiente:

1. **Prototipo** (Interfaz o Clase Abstracta): `TacoPrototype`
2. **Clonacion**: `clonar()`
3. **Prototipo Concreto**: `TacoCanasta`, `TacoDeQueso` y `TacoDeQuesoPicante`
4. **Cliente**: `PuestoDeTacos`

Sucede que un consumidor llego pidiendo varios tacos, pero los pedia con diferentes formas de prepararlos. Como el encargado del puesto no queria prepararlos desde cero, opto por clonar los tacos que tenia y modificarlos segun lo que pedia el consumidor.

Podemos ver como en `PuestoDeTacos.java` se utilizan los prototipos para crear diferentes tipos de tacos. Basicamente lo que hace es obtener un prototipo, crear una copia mediante `clonar()` y luego modificarlo segun lo que pedia el consumidor.

## Ejecucion de ejemplo ⚔️
Esto esta pensado para Linux, si usas Windows (mi caso en estos momentos) puedes usar el git bash para ejecutar los comandos.<br>
Para ejecutar el ejemplo, debes compilar los .java situados en este directorio con el comando:
```bash
javac -d . @sources.txt
```
Luego, enstando en la raiz de este directorio, ejecutar el `PuestoTacos.class` dentro del directorio com/prototype con el comando:
```bash
java com.prototype.PuestoTacos
```

## Ventajas 👍

- Simplifica la creacion de objetos
- Agregar o eliminar objetos en tiempo de ejecución
- El cliente no necesita conocer la complejidad de creacion de objetos
- Clonar es mas eficiente que crear objetos desde cero

## Desventajas 👎

- Clonar objetos complejos puede ser complicado
- Requiere implementar la operación clone() en todas las subclases
- Puede generar problemas de estado compartido si no se manejan correctamente las referencias.

## Referencias 📚

- [CODEANDO_SIMPLE - Patrón Prototype](https://codeandosimple.com/es/design-patterns-prototype)
- [TodoCode - PROTOTYPE](https://youtu.be/fRcbe-3V1c8?si=nYmL5NtGN5_a1GEe)
- [Refactoring Guru - PROTOTYPE](https://refactoring.guru/es/design-patterns/prototype)
- [GeeksforGeeks - Prototype Design Pattern](https://www.geeksforgeeks.org/system-design/prototype-design-pattern/)
