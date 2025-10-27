/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuoperaciones2;

import java.util.Scanner;

/**
 *
 * @author angel
 * @since 22/10/2025
 * REPASO TEMA 4 
 */
public class MenuOperaciones2 {
    /**
     *MÉTODO QUE SE ENCARGA DE REALIZAR LA SUMA DE LOS DOS NÚMEROS
     * @param n1
     * @param n2
     * @return
     */
    public static int suma(int n1, int n2) {
        return n1 + n2;
    }
    /**
     *MÉTODO QUE SE ENCARGA DE REALIZAR LA RESTA DE LOS DOS NÚMEROS
     * @param n1
     * @param n2
     * @return
     */
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }
    /**
     *MÉTODO QUE SE ENCARGA DE REALIZAR LA MULTIPLICACIÓN DE LOS DOS NÚMEROS
     * @param n1
     * @param n2
     * @return
     */
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    /**
     * MÉTODO QUE SE ENCARGA DE REALIZAR LA DIVISIÓN DE LOS DOS NÚMEROS
     * @param n1
     * @param n2
     * @return
     */
    public static int division(int n1, int n2) {
        return n1 / n2;
    }
    public static void main(String[] args) {
        int n1, n2, opc;

        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------- Entrada de datos ------------------");
        System.out.println("Introduce el primer numero: ");// Pedimos el número
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");// Pedimos el número
        n2 = entrada.nextInt();
        
        do {
            System.out.println("--------------  Menú de operaciones ------------------"); // Mostramos el menú de opciones
            System.out.println("Selecciona una opción del menú: ");
            System.out.println("1.  SUMA");
            System.out.println("2.  RESTA");
            System.out.println("3.  MULTIPLICACIÓN");
            System.out.println("4.  DIVISIÓN");
            System.out.println("5.  SALIR");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Has elegido la suma");
                    System.out.println("La suma es: " + MenuOperaciones2.suma(n1, n2));
                    break;
                }
                case 2: {
                    System.out.println("Has elegido la resta");
                    System.out.println("La resta es: " + MenuOperaciones2.resta(n1, n2));
                    break;
                }
                case 3: {
                    System.out.println("Has elegido la multiplicacion");
                    System.out.println("La multiplicación es: " + MenuOperaciones2.multiplicacion(n1, n2));
                    break;
                }
                case 4: {
                    System.out.println("Has elegido la division");
                    try {
                        System.out.println("La división es: " + MenuOperaciones2.division(n1, n2));
                    } catch (ArithmeticException e) {
                        System.out.println("No es posible dividir por 0");
                        System.out.println(e);
                    }
                    break;
                }
                case 5: { // SALIR DEL PROGRAMA
                    System.out.println("Has elegido salir");
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                }
                default: {
                    System.out.println("Opción introducida no válida");
                }
            }
        } while (5 != opc);
    }
}
