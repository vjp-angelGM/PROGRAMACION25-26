/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raizcuadrada2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class calculoRaiz {

    public static int pedirNumero() {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raíz de un número negativo.");
            }
        } while (numero < 0);

        return numero;
    }

    public static double calcularRaiz(int numero) {
        return Math.sqrt(numero);
    }

    public static void mostrarResultado(int numero, double raiz) {
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
