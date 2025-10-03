/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarproducto;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 * EJERCICIO 25 
 * TEMA 2 PROGRAMACION
 */
public class SumarProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        int producto,suma;
        
        Scanner entrada = new Scanner (System.in);
                
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3;
        producto = num1 * num2 * num3;
        
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("El producto de los numeros es: "+producto);
    }
    
}
