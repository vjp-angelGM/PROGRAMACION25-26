/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma3;

/**
 *
 * @author angel
 * @since 26/09/2025
 * EJERCICIO 10 
 * TEMA 2 PROGRAMACIÓN
 */
public class Suma3 {
    final static int num1 = 50; // Declaro como constante el numero 1 y lo incializo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num2 = 30, suma = 0, num3; //Declaro las variables num2, suma y las inicializo y declaro también num3
        num3 = 20; // Inicializo num3 y le doy el valor de 30
        suma = num1 + num2; 
        System.out.println("La suma es: "+suma); //Muestro por pantalla el valor de sumar num1 y num2 
        suma = suma + num3; // Recojo el valor de suma y a ese valor le sumo num3
        System.out.println("La suma ahora es: "+suma); //Muestro de nuevo el valor de suma despues de haberle sumado num3
    }
    
}
