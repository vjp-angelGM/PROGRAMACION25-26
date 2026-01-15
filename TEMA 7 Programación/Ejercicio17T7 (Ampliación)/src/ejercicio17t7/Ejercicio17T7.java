/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17t7;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Ejercicio17T7 {

    /**
     * @param args the command line arguments
     */
    public static int[] rellenarArray() {
        int[] array = new int[10]; // Crear el array aquí
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(9) + 1;
        }
        return array; 
    }

    public static void verArray(int[] array) { // Mostramos el array con los numeros aleatorios 
        System.out.print("Se han generado los siguientes números: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarArray(int[] array) {
        // Algoritmo de ordenación burbuja orden descendente
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) { // Comparamos para orden descendente
                    // Intercambiamos los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Creamos el array con números aleatorios
        int[] array = rellenarArray();

        // Visualizamos el array original
        System.out.println("Array original:");
        verArray(array);

        // Ordenamos el array de mayor a menor
        ordenarArray(array);

        // Visualizamos el array ordenado
        System.out.println("\nArray ordenado de mayor a menor:");
        verArray(array);
    }

}
