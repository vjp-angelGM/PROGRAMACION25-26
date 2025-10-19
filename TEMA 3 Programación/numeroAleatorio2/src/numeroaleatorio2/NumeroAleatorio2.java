/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio2;

import java.util.Scanner; // Importamos la libreria Scanner
import java.util.InputMismatchException; // Importamos la libreria para controlar la excepción

/**
 *
 * @author angel
 */
public class NumeroAleatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intento = 0, numsec = (int) (Math.random() * 100) + 1, num = 0; // Declaramos las variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("He pensado un numero entre 1 y 100. ¡Adivinalo!"); // Le mostramos al usuario el mensaje 

        do {
            try {
                num = entrada.nextInt(); // Recogemos el valor que introduce el usuario
                intento++; // Sumamos intento 

                if (num < numsec) { // Si el numero es menor que el valor 
                    System.out.println("El número es mayor."); // Mostramos este mensaje
                } else if (num > numsec) { // Si el numero es menor que el valor
                    System.out.println("El número es menor."); // Mostramos este mensaje
                } else {
                    System.out.println("¡Correcto! Has adivinado el número en " + intento + " intentos."); // Si ha adivinado el numero le mostramos el mensaje y el numero de intentos que ha necesitado
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Valor introducido no válido"); // Si introduce una letra le mostramos este mensaje 
                System.out.println(e);
                entrada.nextInt();
            }
        }while (num != numsec); // Mientras sea distinto del numero secreto
       
        
    }

}
