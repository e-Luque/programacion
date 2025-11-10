# Programación
![LOGO_JAVA](https://github.com/e-Luque/programacion/blob/main/Assets/wp7250161.png?raw=true)
Repositorio dedicado a las practicas de programación de 1ºDAW
* Cristian Luque Ruiz (e-Luque)
* IES FCO ROMERO VARGAS
### PRÁCTICAS REALIZADAS
#### PRÁCTICA 1 (NO SUBIDA)
#### PRÁCTICA 2 (FINALIZADA)

---

# Práctica 2
## EJERCICIOS

### 1. Fundamentos de arrays

#### Ejercicio 1

Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el índice y el valor al que corresponde.

#### Ejercicio 2
Muestra por pantalla todos los elementos de un array de números enteros separados por
un espacio.

#### Ejercicio 3
Crea un array que contenga 5 números. Realiza un programa que te muestre por pantalla
SOLO el más pequeño de ellos.

#### Ejercicio 4
Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
Obtén la suma de todos ellos y la media.

#### Ejercicio 5
Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
valor de cada posición y la suma de todos los valores.

### 2. Procesamiento con condiciones

#### Ejercicio 6
Programa Java que guarda en un array 10 números enteros que se leen por teclado. A
continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos
y cuántos ceros.

#### Ejercicio 7
Programa Java que llene un array con 10 números enteros que se leen por teclado. A
continuación calcula y muestra la media de los valores positivos y la de los valores negativos
del array.

#### Ejercicio 8
Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas
personas tienen una altura superior a la media y cuántas tienen una altura inferior a la
media. El valor de N se pide por teclado y debe ser entero positivo.

### 3. Arrays combinados y bidimensionales

#### Ejercicio 9 - Máximo, mínimo y posiciones
Crea un programa en Java que:
1. Pida al usuario por teclado 10 números enteros y los guarde en un array.
2. Recorra el array para encontrar:
    * El valor máximo y la posición en la que aparece.
    * El valor mínimo y la posición en la que aparece.
      Muestre el resultado en consola, por ejemplo:

`Valor máximo: 92 en la posición 4`

`Valor mínimo: -3 en la posición 7`

#### Ejercicio 10
Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de
estudiantes con sus respectivas notas. El nombre del estudiante lo introduce el usuario por
teclado (usa la clase Scanner). Utiliza un array para los nombres de los alumnos y otro para
las notas. ¿Serías capaz de hacerlo con un array BIdimensional?

#### Ejercicio 11
Escribe un programa java que invierta el orden de los valores de un array. Por invertir el
orden de los valores de un array, me refiero que el último pasa a ser el primero, el
penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6.

#### Ejercicio 12
En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en
el que figura un número y una letra, por ejemplo 56999545W. Realiza un programa donde le
pidas al usuario SOLO el número del dni y el programa te devuelva la letra. Para calcular la
letra solo tienes que dividir el número del DNI entre 23, el resto de esta división se corresponde con la posición de la letra en el abecedario. Utiliza un array para guardar CADA
letra del abecedario.

### 4. Transición a listas dinámicas (`ArrayList`)

#### Ejercicio 13 – Lista de números y suma total
Crea un programa que:
* Cree una lista de enteros (`ArrayList<Integer>`).
* Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
* Muestre por pantalla todos los números de la lista y la suma total de los mismos.

#### Ejercicio 14– Lista de nombres y búsqueda
Crea un programa que:
* Cree una lista de Strings (`ArrayList<String>`).
* Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
* Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en qué posición se encuentra si existe.

#### Ejercicio 15 – Ordenar y eliminar duplicados
Crea un programa que:
* Cree una lista de enteros (`ArrayList<Integer>`).
* Pida al usuario 10 números enteros y los añada a la lista.
* Elimine los valores duplicados manteniendo solo el primero que apareció.
* Ordene la lista de menor a mayor y la muestre por pantalla.

# Práctica 2
## EJERCICIOS

#### Ejercicio 1

Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y
asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del
array dispuestos en forma de tabla como se muestra en la figura.

#### Ejercicio 2
Escribe un programa que solicite 20 números enteros. Estos números debemos de
introducirlo en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales
de filas y en las columnas el mayor número de la columna. La suma total debe aparecer en
la esquina inferior derecha.

#### Ejercicio 3
Modifica el programa anterior de tal forma que los números que se introducen en el array
se generen de forma aleatoria (valores entre 1 y 1999).
#### Ejercicio 4
Modifica el programa anterior de tal forma que las sumas parciales y la suma total
aparezcan en la pantalla con un pequeño retraso, dando la impresión de que el ordenador
se queda “pensando” antes de mostrar los números.

#### Ejercicio 5
Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas
por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos
incluidos). A continuación, el programa deberá:
* dar la posición del número máximo y mínimo
* la suma total de todas las filas y columnas
* la suma de todas las columnas
* la suma de todas las filas.

#### Ejercicio 6
Modifica el programa anterior de tal forma que no se repita ningún número en el array
además de que tiene que estar comprendido en un rango entre 20-40.

#### Ejercicio 7
Modifica el programa del Ejercicio 6 para que:
1. Los números NO se repitan (como en el ejercicio anterior).
2. Los números estén comprendidos en un rango dinámico (el usuario introduce el
   valor mínimo y máximo).
3. Al final, el programa muestre:
   * La media aritmética de todos los números del array.
   * La posición de todos los números primos que haya en el array.
   * Una representación gráfica en consola de cada fila, donde cada número se represente con un número de * proporcional a su valor dentro del rango dado (por ejemplo, si el rango es 10-20 y aparece el 15, se mostrarán 5 *).

#### Ejercicio 8 - Busqueda del tesoro (NO REALIZADO)
Realizar el juego de la “Búsqueda del tesoro” donde si te acercas al tesoro te va avisando de
que hay un tesoro cerca pero agregando que tenemos dos posibles tesoros en el juego y
uno de ellos es un impostor

#### Ejercicio 9 - Ajedrez
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué
casillas podría saltar un caballo que se encuentra en esa posición. Como se indica en la  figura, el caballo se mueve siempre en forma de L. El tablero cuenta con 64 casillas. Las
columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

#### Ejercicio 10 - Tres en Raya (NO REALIZADO)
Realiza el juego de las tres en raya.
