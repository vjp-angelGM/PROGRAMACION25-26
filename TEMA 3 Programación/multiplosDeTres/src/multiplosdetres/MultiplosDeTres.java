/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplosdetres;

import java.util.Scanner; // Importamos la libreria Scanner

/**
 *
 * @author angel
 */
public class MultiplosDeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // Declaramos el número
        Scanner entrada = new Scanner(System.in); // Declaramos el Scanner
        do {
            System.out.println("Introduce un número: "); // Pedimos el número al usuario
            num = entrada.nextInt(); // Recogemos el número

            if (num < 1) { // Si el número es menor a 1 le mostramos el mensaje
                System.out.println("El numero introducido no puede ser menor de 1.");
            }
        } while (num < 1); // Repite mientras el numero sea menor de 1
        System.out.println("Los múltiplos de 3 que hay entre 1 y " + num + " son:"); // Muestra el mensaje con los múltiplos de 3 que hay entre 1 y el número introducido
        for (int i = 1; i < num; i++) { // Hacemos un bucle for para recorrer desde el 1 hasta el numero que introduzca el usuario
            if (i % 3 == 0) { //Si el numero es divisible por 3
                System.out.println(i); //Lo imprime 
            }
        }

    }

}
