/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;
import java.util.*; //Importamos la libreria java.util
/**
 *
 * @author angel
 * @since 10/10/2025
 * EJERCICIO 12 TEMA 3 PROGRAMACION
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 11; //Declaro la variable num y la inicializo en 11
        do { // Inicializo el bucle
            if (num % 2 == 0){ //Le pongo una condición, que mientras sea divisible por dos
                System.out.println(num); //Imprime el numero
            }
            num++; //Añade el número
        }while (num <=133); //Y le digo que se repita esta condicion mientras no llegue a ese numero
    }
    
}
