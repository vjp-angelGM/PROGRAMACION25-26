/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;
import java.util.Scanner; // Importamos la libreria Scanner
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
      int num1, num2, num3, mayor; // Declaramos las variables 
      Scanner entrada = new Scanner (System.in); // Hacemos el Scanner 
      
        System.out.println("Introduce el primer número:  "); // Pedimos que introduzca el primer numero
        num1 = entrada.nextInt(); // Recogemos el valor del primer numero
        
        System.out.println("Introduce el segundo número: "); // Pedimos que introduzca el segundo numero
        num2 = entrada.nextInt(); // Recogemos el valor del segundo numero
        
        System.out.println("Introduce el tercer número: "); // Pedimos que introduzca el tercer numero
        num3 = entrada.nextInt(); // Recogemos el valor del tercer numero
        
        if (num1 >= num2 && num1 >= num3){ // Comnparamos los numeros 1 y 2 y también el 1 y 3
            mayor = num1; 
            System.out.println("El mayor es: "+num1); // Mostramos que el 1 es el mayor en el caso de que sea cierto
        }else if  (num2 >= num1 && num2 >= num3){ // Comparamos los numeros 2 y 1 y también el 2 y 3 
            mayor = num2;
            System.out.println("El mayor es: "+num2); // Mostramos que el 2 es el mayor en el caso de que se cumpla 
        }else {
            mayor = num3;
            System.out.println("El mayor es: "+num3); // Si no se cumple ninguna de las condiciones anteriores será el tercer número el mayor de todos
        }
    }
}
