/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25t5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio25T5 {

    public static int pedirRam() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cantidad de memoria RAM (GB): ");
        return entrada.nextInt();
    }

    public static int pedirDisco() {
        Scanner entrada = new Scanner(System.in);
        int capacidad;
        do {
            System.out.println("Capacidad del disco duro (Múltiplo de 5) :  ");
            capacidad = entrada.nextInt();
        } while (capacidad % 5 != 0);
        return capacidad;
    }

    public static double pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        double precio;
        do {
            System.out.println("Introduce un precio: ");
            precio = entrada.nextDouble();
        } while (precio <= 0);
        return precio;
    }

    public static double pedirTamanoMonitor() {
        Scanner entrada = new Scanner(System.in);
        double tamano;
        do {
            System.out.println("Introduce un tamaño de monitor : ");
            tamano = entrada.nextDouble();
        } while (tamano < 14);
        return tamano;
    }

    public static String pedirRaton() {
        Scanner entrada = new Scanner(System.in);
        String raton;
        System.out.println("Introduce el modelo del ratón: ");
        raton = entrada.next();
        return raton;
    }

    public static void main(String[] args) {
    }

}
