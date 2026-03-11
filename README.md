# Sistema de Gestión de Tareas en Java

## Descripción del Proyecto

Este proyecto consiste en un **Sistema de Gestión de Tareas** desarrollado en **Java**.
El programa permite crear y administrar tareas utilizando una estructura de datos **ArrayList**.

El objetivo del proyecto es practicar conceptos importantes de programación como:

* Programación Orientada a Objetos (POO)
* Uso de estructuras de datos
* Análisis básico de complejidad de algoritmos (Big O)

El sistema funciona desde consola y permite almacenar, buscar, actualizar y eliminar tareas.

---

## Funcionalidades

El programa incluye las siguientes funcionalidades:

* Agregar una nueva tarea
* Listar todas las tareas
* Buscar una tarea por su ID
* Marcar una tarea como completada
* Eliminar una tarea
* Mostrar tareas pendientes
* Filtrar tareas por prioridad

---

## Estructura del Proyecto

El proyecto está organizado en tres clases principales:

Tarea.java
SistemaTareas.java
Main.java

### Tarea.java

Esta clase representa una tarea dentro del sistema.

Cada tarea contiene:

* id → identificador único de la tarea
* descripcion → descripción de la tarea
* prioridad → valor entre 1 y 5
* completada → indica si la tarea ya fue finalizada

---

### SistemaTareas.java

Esta clase se encarga de gestionar la lista de tareas utilizando **ArrayList**.

Aquí se implementan los métodos que permiten:

* agregar tareas
* buscarlas por ID
* eliminarlas
* filtrarlas por prioridad
* marcarlas como completadas

---

### Main.java

Esta clase contiene el método **main**, donde se ejecuta el programa.

En esta parte se crean algunas tareas de ejemplo y se prueban los diferentes métodos del sistema para verificar que todo funcione correctamente.

---

## Complejidad de los Métodos

Se analizó la complejidad de cada método utilizando **notación Big O**.

| Método                    | Complejidad |
| ------------------------- | ----------- |
| agregarTarea              | O(1)        |
| listarTareas              | O(n)        |
| buscarPorId               | O(n)        |
| marcarCompletada          | O(n)        |
| eliminarTarea             | O(n)        |
| obtenerTareasPendientes   | O(n)        |
| obtenerTareasPorPrioridad | O(n)        |

En la mayoría de los casos la complejidad es **O(n)** porque se debe recorrer la lista de tareas.

---

## Cómo ejecutar el programa

1. Compilar los archivos:

javac *.java

2. Ejecutar el programa:

java Main

---

## Ejemplo de uso

El programa crea algunas tareas de ejemplo como:

* Hacer tarea de programación
* Estudiar para un examen
* Ir al gimnasio
* Comprar comida

Después el sistema permite listar las tareas, buscarlas por ID, marcarlas como completadas y eliminarlas.

---

## Autor

Proyecto desarrollado como práctica académica para reforzar conocimientos en:

* Programación en Java
* Programación Orientada a Objetos
* Estructuras de datos
* Análisis de complejidad de algoritmos
