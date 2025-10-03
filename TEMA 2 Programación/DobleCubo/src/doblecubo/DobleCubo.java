/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doblecubo;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 * EJERCICIO 27
 * TEMA 2 PROGRAMACIÓN
 */
public class DobleCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, doble, cubo;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        
        doble = numero * numero;
        cubo = numero * numero * numero;
        
        System.out.println("El doble de "+numero+" es: "+doble);
        System.out.println("El cubo de "+numero+" es: "+cubo);
    }
    
}
