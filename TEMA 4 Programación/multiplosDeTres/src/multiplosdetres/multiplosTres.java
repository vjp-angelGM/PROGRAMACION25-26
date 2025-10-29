/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplosdetres;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class multiplosTres {

    public static int pedirNum() {
        int num; // Declaramos el número
        Scanner entrada = new Scanner(System.in); // Declaramos el Scanner
        do {
            System.out.println("Introduce un número: "); // Pedimos el número al usuario
            num = entrada.nextInt(); // Recogemos el número

            if (num < 1) { // Si el número es menor a 1 le mostramos el mensaje
                System.out.println("El numero introducido no puede ser menor de 1.");
            }
        } while (num < 1);
        return num;
    }

    public static boolean valido(int num) {
        return num > 0;
    }

    public static void mostrarMultiplos(int num) {
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + num + " :");
        for (int i = 1; i < num; i++) { // Hacemos un bucle for para recorrer desde el 1 hasta el numero que introduzca el usuario
            if (i % 3 == 0) { //Si el numero es divisible por 3
                System.out.println(i); //Lo imprime 
                contador++;
            }
        }
        System.out.println("Total de múltiplos de 3: " + contador);
    }
}
