/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividirnumeros;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class DividirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividendo, divisor, resultado;
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Dividendo: ");
            dividendo = entrada.nextInt();

            System.out.println("Divisor: ");
            divisor = entrada.nextInt();

            resultado = dividendo / divisor;
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por 0 ");
            System.out.println(e);
        }
    }

}
