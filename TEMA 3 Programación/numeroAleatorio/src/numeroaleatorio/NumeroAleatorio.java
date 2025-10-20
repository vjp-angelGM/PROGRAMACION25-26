/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

import java.util.Scanner; // Importamos la librería Scanner

/**
 *
 * @author angel
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intento = 0, numsec = (int) (Math.random() * 100) + 1, num = 0; // Declaramos las variables 
        Scanner sc = new Scanner(System.in); // Declaramos el Scanner 
        System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!"); // Le mostramos al usuario este mensaje 

        /* while (num != numsec){
            System.out.println("Introduce un numero por favor");
            num = sc.nextInt();
            intento++;
            
            if (num < numsec){
                System.out.println("El numero es mayor");
            }else if (num > numsec) {
                System.out.println("El numero es menor");
            }else {
                System.out.println("¡Correcto!. Has adivinado el número en "+intento);
            }
        }
    }*/
        do {
            System.out.println("Introduce un número: "); // Le decimos que introduzca un número
            num = sc.nextInt(); // Recogemos el número
            intento++; // Sumas el intento
            if (num < numsec) {
                System.out.println("El número es mayor"); // Si el número es mayor mostramos este mensaje
            } else if (num > numsec) {
                System.out.println("El número es menor"); // Si es menor se muestra este mensaje 
            } else {
                System.out.println("¡Correcto!. Has adivinado el número en " + intento+" intentos."); // Si lo adivina mostraremos el mensaje que lo ha adivinado en X intentos
            }
        } while (num != numsec);
    }
}
