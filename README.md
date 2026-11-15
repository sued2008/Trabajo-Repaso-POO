# Trabajo de Repaso de POO

Dos trabajos prácticos en Java. Cada carpeta tiene un `Main.java` con los ejercicios y ejemplos de ejecución.

| Práctico | Ejercicios |
| --- | --- |
| Clases y objetos | Persona, Libro, Auto, CuentaBancaria y Rectangulo |
| Herencia simple y validaciones | Persona → Empleado, Vehiculo → Auto y Animal → Perro |

## Ejecutar

Con el JDK instalado, corré estos comandos desde la raíz del repositorio.

```sh
javac -encoding UTF-8 -d out clasesobjetos/Main.java herencia/Main.java
java -cp out clasesobjetos.Main
java -cp out herencia.Main
```

## Diagramas UML

Abrí [UML.drawio](UML.drawio) en draw.io. Tiene ocho páginas, una por ejercicio. Los signos `+`, `-` y `~` indican visibilidad pública, privada y de paquete. El triángulo hueco apunta a la clase padre.

En el punto 5 de Clases y Objetos se instancia `Rectangulo`, la clase que el enunciado pide definir. Su área se calcula como base por altura.
