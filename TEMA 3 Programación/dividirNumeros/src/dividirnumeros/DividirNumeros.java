/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividirnumeros;

import java.util.Scanner; // Importamos la libreria Scanner

/**
 *
 * @author angel
 */
public class DividirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividendo, divisor, resultado; // Declaramos las variables
        Scanner entrada = new Scanner(System.in); // Hacemos el Scanner

        try { // Intentamos dividir los numeros
            System.out.println("Dividendo: ");
            dividendo = entrada.nextInt();

            System.out.println("Divisor: ");
            divisor = entrada.nextInt();

            resultado = dividendo / divisor;
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
            
        } catch (ArithmeticException e) { // Si introduce el numero 0 le muestra el mensaje de error
            System.out.println("No puedes dividir por 0 ");
            System.out.println(e);
        }
    }

}
