/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio3T7 {

    /**
     * @param args the command line arguments
     */
    
    //Método que rellena el array con numeros aleatorios entre 1 y 6 
    public static int[] rellenarArray(int longitud) {
        int[] array = new int[longitud];
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(6) + 1; // Genera números entre 1 y 6
        }
        return array;   
    }

    //Método que muestra el array con el contenido generado
    public static void mostrarArray(int [] array){
        System.out.println("CONTENIDO DEL ARRAY");
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1 ){
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
    }
    
    //Método que pide la longitud del array al usuario
    public static int pedirLongitud(){
        Scanner entrada = new Scanner (System.in);
        int longitud = 0;
        boolean entradaCorrecta = false;
        
        while (!entradaCorrecta){
            try{
                System.out.println("Introduce la longitud del array ( 1 - 10) ");
                longitud = entrada.nextInt();
                
                if (longitud >= 1 && longitud <= 10){
                    entradaCorrecta = true;
                }else {
                    System.out.println("Error. La longitud debe ser entre 1 y 10");
                }
            }catch (InputMismatchException e){
                System.out.println("Error, Debes introducir un número");
            }
        }
        return longitud;
    }
    
    
    public static void main(String[] args) {
        System.out.println("GENERADOR DE ARRAYS ALEATORIO");
        int longitud = pedirLongitud();
        int [] array = rellenarArray(longitud);
        mostrarArray(array);
    }

}
