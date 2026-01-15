/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t7;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Ejercicio10T7 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarArray(int[] array) {
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(8) + 1;
        }
    }

    public static void verArray(int[] array) {
        System.out.print("Se han generado los siguientes números: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sustituirRepetidos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Si el elemento ya es 0, lo saltamos
            if (array[i] == 0) {
                continue;
            }

            // Buscamos si hay duplicados del elemento actual
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0; // Sustituimos el duplicado por 0
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        // Rellenamos el array con números aleatorios
        rellenarArray(array);

        // Mostramos el array original
        verArray(array);

        // Sustituimos los elementos repetidos por 0
        sustituirRepetidos(array);

        // Mostramos el array modificado
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        verArray(array);
    }
}
