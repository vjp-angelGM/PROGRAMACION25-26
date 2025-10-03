/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author angel
 * @since 28/09/2025
 * Ejercicio 17 
 * TEMA 2 PROGRAMACIÓN
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    final static int VALOR1 = 25;
    final static int VALOR2 = 20;
    final static int VALOR3 = 15;
    final static int VALOR4 = 10;
    final static int VALOR5 = 2;
    final static int VALOR6 = 3;
    final static int VALOR7 = 4;
    final static int VALOR8 = 8;
    public static void main(String[] args) {
         // a) 25 + 20 - 15
        int resultadoA = VALOR1 + VALOR2 - VALOR3;

        // b) 20 * 10 + 15 * 10
        int resultadoB = VALOR2 * VALOR4 + VALOR3 * VALOR4;

        // c) 20 * 10 / 2 - 20 / 5 * 3
        int resultadoC = VALOR2 * VALOR4 / VALOR5 - VALOR2 / VALOR3 * VALOR6;

        // d) 15 / 10 * 2 + 3 / 4 * 8
        int resultadoD = VALOR3 / VALOR4 * VALOR5 + VALOR6 / VALOR7 * VALOR8;

        // Mostrar resultados
        System.out.println("=== Resultados de las expresiones ===");
        System.out.println("a) " + VALOR1 + " + " + VALOR2 + " - " + VALOR3 + " = " + resultadoA);
        System.out.println("b) " + VALOR2 + " * " + VALOR4 + " + " + VALOR3 + " * " + VALOR4 + " = " + resultadoB);
        System.out.println("c) " + VALOR2 + " * " + VALOR4 + " / " + VALOR5 + " - " + VALOR2 + " / " + VALOR3 + " * " + VALOR6 + " = " + resultadoC);
        System.out.println("d) " + VALOR3 + " / " + VALOR4 + " * " + VALOR5 + " + " + VALOR6 + " / " + VALOR7 + " * " + VALOR8 + " = " + resultadoD);
        
    }
    
}
