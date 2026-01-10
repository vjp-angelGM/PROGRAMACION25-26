/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio2T7 {

    /**
     * @param args the command line arguments
     */
    
    
    //Método que pide al usuario 7 números enteros para rellenar el array
    public static void rellenarArray(int array[]) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("ARRAY DE 7 NUMEROS ENTEROS");
        for (i = 0; i < 7; i++) {
            System.out.println("Introduce un valor para la posicion " + i + ": ");
            array[i] = entrada.nextInt();
        }
    }
    
 //Método que muestra el array 
 public static void mostrarArray(int array[]) {
        int i;
        System.out.println("\n");
        System.out.println("MOSTRANDO ARRAY");
        for (i = 0; i < 7; i++){
            System.out.println("El valor guardado en la posición "+i+" es de: "+array[i]);
        }
    }
 
 //Método que hace el intercambio de posicion de la segunda y cuarta posicion de los valores del array
 public static void intercambio(int array[]){
     int aux;
     System.out.println("\n");
     System.out.println("MOSTRANDO ARRAY CON POSICIONES INTERCAMBIADAS");
     aux = array[1];
     array [1] = array [3];
     array [3] = aux;
     for (int i = 0; i < array.length; i++){
         System.out.println(array[i]+ " ");
     }
 }
 
    public static void main(String[] args) {
        int [] array = new int [7];
        rellenarArray(array);
        intercambio(array);
        mostrarArray(array);
    }
    
}
