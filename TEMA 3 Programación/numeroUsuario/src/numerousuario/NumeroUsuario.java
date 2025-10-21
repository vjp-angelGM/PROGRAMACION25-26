/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerousuario;

import java.util.Scanner; // Importamos la librería Scanner 

/**
 *
 * @author angel
 */
public class NumeroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // Declaramos la variable 
        Scanner entrada = new Scanner(System.in); // Hacemos el Scanner
        do { // Hacemos este bucle
            System.out.println("Introduce un numero:  "); // Pedimos el número al usuario
            num = entrada.nextInt();

            if (num < 1) {
                System.out.println("El numero introducido no puede ser menor de 1"); // Si el número es menor de 1 le mostramos este mensaje 
            }

        } while (num < 1);
        System.out.println("Los numeros que hay entre 1 y " + num + " son: "); //mostramos este mensaje para mostrar la cantidad de numeros que hay entre el 1 y el numero introducido por el usuario
        for (int i = 2; i < num; i++) {
            System.out.println(i);
        }
    }

}
