/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaproducto;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 10/10/2025
 * EJERCICIO 2 TEMA 3 PROGRAMACION
 */
public class SumaProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado, num1, num2;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = entrada.nextInt();
         
        if (num1 > 10){
            resultado = num1 * num2;
        }else {
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: "+resultado);
    }
    
}
