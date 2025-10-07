/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 04/10/2025
 * EJERCICIO 3
 * TEMA 3 PROGRAMACIÓN
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1, num2, num3, mayor;
      Scanner entrada = new Scanner (System.in);
      
        System.out.println("Introduce el primer número:  ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        num3 = entrada.nextInt();
        
        if (num1 >= num2 && num1 >= num3){
            mayor = num1;
            System.out.println("El mayor es: "+num1);
        }else if  (num2 >= num1 && num2 >= num3){
            mayor = num2;
            System.out.println("El mayor es: "+num2);
        }else {
            mayor = num3;
            System.out.println("El mayor es: "+num3);
        }
    }
}
