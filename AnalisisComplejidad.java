// Fragmento 1
public static int encontrarMaximo(int[] array) {
 int max = array[0]; //asumimos que el primer elemento es el máximo
 for (int i = 1; i < array.length; i++) { //comienza desde el segundo elemento
 if (array[i] > max) { //si encontramos un elemento mayor, actualizamos el máximo
 max = array[i]; //se actualiza el valor de max
  }
 }
 return max; //devuelve el valor máximo encontrado en el array

} // Complejidad: O(n) - Recorre el array una vez para encontrar el máximo. 
//Explicación: Realiza una operación de comparación por cada elemento del array, lo que resulta en una complejidad lineal.El número de iteraciones es directamente proporcional al tamaño del array (n),

// Fragmento 2
public static boolean esPrimo(int n) {
 if (n <= 1) return false; //los números menores o iguales a 1 no son primos
 for (int i = 2; i <= Math.sqrt(n); i++) { //Comenzamos a verificar desde el 2 hasta la raíz cuadrada de n
 if (n % i == 0) return false; //si n es divisible por cualquier número entre 2 y la raíz cuadrada de n, no es primo
 }
 return true; //si no encontramos ningún divisor, n es primo
}
// Complejidad: O(√n) - Verifica divisores hasta la raíz cuadrada de n.
//Explicación: Para determinar si un número n es primo, solo necesitamos verificar los posibles divisores hasta la raíz cuadrada de n. Esto se debe a que si n es divisible por algún número mayor que su raíz cuadrada, entonces también será divisible por un número menor que la raíz cuadrada. Por lo tanto, el número de iteraciones es proporcional a la raíz cuadrada de n, lo que resulta en una complejidad de O(√n).


// Fragmento 3
public static void imprimirMatriz(int[][] matriz) {  
 for (int i = 0; i < matriz.length; i++) { //recorre cada fila de la matriz
 for (int j = 0; j < matriz[i].length; j++) { //recorre cada columna de la fila actual
 System.out.print(matriz[i][j] + " "); //imprime el elemento actual seguido de un espacio
 }
 System.out.println(); //imprime una nueva línea después de imprimir cada fila
 }
} // Complejidad: O(m*n) - Recorre cada elemento de la matriz.
//Explicación: La función recorre cada fila (m) y cada columna (n) de la matriz, lo que resulta en una complejidad de O(m*n). El número total de elementos en la matriz es m*n, por lo que el tiempo de ejecución es proporcional al número total de elementos.

// Fragmento 4
public static int busquedaBinaria(int[] array, int objetivo) {
 int izq = 0, der = array.length - 1; //inicializamos los índices de búsqueda
 while (izq <= der) { //mientras el índice izquierdo no supere al derecho
 int medio = izq + (der - izq) / 2; //calculamos el índice del elemento medio para evitar desbordamiento
 if (array[medio] == objetivo) return medio; //si el elemento medio es el objetivo, devolvemos su índice
 if (array[medio] < objetivo) izq = medio + 1; //si el elemento medio es menor que el objetivo, buscamos en la mitad derecha
 else der = medio - 1; //si el elemento medio es mayor que el objetivo, buscamos en la mitad izquierda
 }
 return -1;//si no encontramos el objetivo, devolvemos -1
}// Complejidad: O(log n) - Divide el espacio de búsqueda a la mitad en cada iteración.
//Explicación: La búsqueda binaria funciona dividiendo el espacio de búsqueda a la mitad



public static void main(String[] args) { // Ejemplos de uso de las funciones
 int[] array = {3, 1, 4, 1, 5, 9};
 System.out.println("Máximo: " + encontrarMaximo(array));
 System.out.println("¿Es primo? " + esPrimo(7));
 int[][] matriz = {{1, 2}, {3, 4}};
 imprimirMatriz(matriz);
 int[] sortedArray = {1, 2, 3, 4, 5};
 System.out.println("Índice del objetivo: " + busquedaBinaria(sortedArray, 3));
}