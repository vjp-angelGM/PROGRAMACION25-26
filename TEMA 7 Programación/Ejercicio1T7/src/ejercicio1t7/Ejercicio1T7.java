/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio1T7 {

    /**
     * @param args the command line arguments
     */
    
    //Método que pide al usuario que introduzca 10 números
    public static void rellenarArray(int array[]) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("ARRAY DE 10 NUMEROS ENTEROS");
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce un valor para la posicion " + i + ": ");
            array[i] = entrada.nextInt();
        }
    }

    //Método que muestra los números pares que hay dentro del array
    public static void mostrarPares(int array[]) {
        int i;
        System.out.println("\n");
        System.out.println("NUMEROS PARES DENTRO DEL ARRAY");
        for (i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //Método que muestra el contenido del array 
    public static void mostrarArray(int array[]) {
        int i;
        System.out.println("\n");
        System.out.println("MOSTRANDO ARRAY");
        for (i = 0; i < 10; i++){
            System.out.println("El valor guardado en la posición "+i+" es de: "+array[i]);
        }
    }

    public static void main(String[] args) {
        int [] array = new int [10];
        rellenarArray(array);
        mostrarPares(array);
        mostrarArray(array);
    }

}
