/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerousuario;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class numeroHasta {

    public static int pedirNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do { // Hacemos este bucle
            System.out.println("Introduce un numero:  "); // Pedimos el número al usuario
            numero = entrada.nextInt();

            if (numero < 1) {
                System.out.println("El numero introducido no puede ser menor de 1"); // Si el número es menor de 1 le mostramos este mensaje 
            }

        } while (numero < 1);
        System.out.println("Los numeros que hay entre 1 y " + numero + " son: "); //mostramos este mensaje para mostrar la cantidad de numeros que hay entre el 1 y el numero introducido por el usuario
        for (int i = 2; i < numero; i++) {
            System.out.println(i);
        }
        return numero;
    }
}
