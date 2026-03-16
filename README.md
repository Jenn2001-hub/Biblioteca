[README.md](https://github.com/user-attachments/files/26038815/README.md)

# Sistema de Gestión de Biblioteca

Sistema de gestión de materiales bibliográficos desarrollado en Java, que permite registrar, listar y calcular multas por retraso para diferentes tipos de materiales como libros, revistas y películas.



## Descripción

Este proyecto implementa un sistema de consola para administrar los materiales de una biblioteca. Aplica principios de Programación Orientada a Objetos (POO) como herencia, abstracción y polimorfismo, permitiendo gestionar distintos tipos de materiales bajo una estructura común.


## Estructura del Proyecto

Biblioteca-main/
├── MaterialBibliografico.java   # Clase abstracta base
├── Libro.java                   # Subclase: Libro
├── Revista.java                 # Subclase: Revista
├── Pelicula.java                # Subclase: Película
└── Main.java                    # Clase principal con menú interactivo



## Diagrama de Clases


                  ┌──────────────────────────────┐
                  │   MaterialBibliografico      │ 
                  │──────────────────────────────│
                  │ - titulo: String             │
                  │ - anio: int                  │
                  │ - genero: String             │
                  │──────────────────────────────│
                  │ + calcularMulta(int): double │  
                  │ + mostrarInformacion(): void │
                  └──────────┬───────────────────┘
                             │
          ┌──────────────────┼─────────────────┐
          │                  │                 │
   ┌──────┴──────┐   ┌───────┴──────┐   ┌──────┴──────┐
   │    Libro    │   │   Revista    │   │   Pelicula  │
   │─────────────│   │──────────────│   │─────────────│
   │ - autor     │   │ - nroEdicion │   │ - duracion  │
   │ - numPaginas│   │              │   │             │
   └─────────────┘   └──────────────┘   └─────────────┘
   


## Clases y Funcionalidades


### MaterialBibliografico 

Clase base que define los atributos y comportamientos comunes a todos los materiales.

|----------|--------|--------------------------------|
| Atributo | Tipo   | Descripción                    |
|----------|--------|--------------------------------|
| `titulo` | String | Título del material            |
| `anio`   | int    | Año de publicación/lanzamiento |
| `genero` | String | Género del material            |
|----------|--------|--------------------------------|

- Método abstracto `calcularMulta(int diasRetraso)`: cada subclase implementa su propia lógica de cálculo.
- Método `mostrarInformacion()`: imprime los datos del material en consola.



### Libro

Extiende `MaterialBibliografico`. Representa un libro de la biblioteca.

|-----------------|--------|-------------------|
| Atributo        | Tipo   | Descripción       |
|-----------------|--------|-------------------|
| `autor`         | String | Nombre del autor  |
| `numeroPaginas` | int    | Número de páginas |
|-----------------|--------|-------------------|

**Multa:** `diasRetraso × $5.000`



### Revista

Extiende `MaterialBibliografico`. Representa una revista de la biblioteca.
|-----------------|------|---------------------------------|
| Atributo        | Tipo | Descripción                     |
|-----------------|------|---------------------------------|
| `numeroEdicion` | int  | Número de edición de la revista |
|-----------------|------|---------------------------------|

**Multa:** `diasRetraso × $3.000`



### Pelicula

Extiende `MaterialBibliografico`. Representa una película disponible en la biblioteca.

|------------|------|---------------------|
| Atributo   | Tipo | Descripción         |
|------------|------|---------------------|
| `duracion` | int  | Duración en minutos |
|------------|------|---------------------|

**Multa:** `diasRetraso × $10.000`



### Main

Clase principal que ejecuta la aplicación. Presenta un menú interactivo en consola con las siguientes opciones:
|------------------------------------|
|=== BIBLIOTECA - MENU PRINCIPAL === |
|1. Agregar material                 |
|2. Listar materiales                |
|3. Calcular multa                   |
|4. Salir                            |
|------------------------------------|



##  Tabla de Multas por Retraso

|------------------|--------------------------|
| Tipo de Material | Multa por día de retraso |
|------------------|--------------------------|
| Libro            | $5.000                   |
| Revista          | $3.000                   |
| Película         | $10.000                  |
|---------------------------------------------|

> Si los días de retraso son 0 o negativos, la multa es $0.


##  Requisitos

- **Java** JDK 8 o superior
- Terminal / línea de comandos



##  Cómo ejecutar

1. **Clona o descarga** el repositorio:

   ```bash
   git clone https://github.com/Jenn2001-hub/Biblioteca
   cd Biblioteca-main
   ```

2. **Compila** todos los archivos Java:

   ```bash
   javac *.java
   ```

3. **Ejecuta** la aplicación:

   ```bash
   java Main
   ```


## 🧪 Ejemplo de uso

```
=== BIBLIOTECA - MENU PRINCIPAL ===
1. Agregar material
2. Listar materiales
3. Calcular multa
4. Salir
Seleccione una opcion: 1

Seleccione el tipo de material:
1. Libro
2. Revista
3. Pelicula
1
Titulo: El Principito
Año: 1943
Genero: Ficción
Autor: Antoine de Saint-Exupéry
Numero de paginas: 96
Material agregado correctamente.

Seleccione una opcion: 3
Ingrese dias de retraso: 4

Material: El Principito
Multa: $20000.0
```



## Conceptos de POO aplicados

- **Abstracción:** La clase `MaterialBibliografico` define una plantilla común sin implementar la lógica de multa.
- **Herencia:** `Libro`, `Revista` y `Pelicula` extienden la clase base reutilizando atributos y métodos comunes.
- **Polimorfismo:** Cada subclase implementa `calcularMulta()` y `mostrarInformacion()` de forma propia, permitiendo tratar todos los materiales de manera uniforme a través del tipo base.
- **Encapsulamiento:** Los atributos son privados y se accede a ellos mediante getters y setters con validaciones.



