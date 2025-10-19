/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaproducto;
import java.util.Scanner; // Importamos la libreria Scanner
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
        int resultado, num1, num2; // Declaramos las variables 
        Scanner entrada = new Scanner (System.in); // Hacemos el Scanner 
        System.out.println("Introduce un numero: "); // Pedimos el primer numero
        num1 = entrada.nextInt(); // Recogemos el primer numero
        System.out.println("Introduce otro numero: "); // Pedimos el segundo numero
        num2 = entrada.nextInt(); // Recogemos el segundo numero
         
        if (num1 > 10 && num2 > 10){ // Si el numero es mayor de 10 
            resultado = num1 * num2; // Se multiplican 
        }else { // Si ninguno de los dos numeros son mayores de 10 
            resultado = num1 + num2; // Se suman
        }
        System.out.println("El resultado es: "+resultado); // Mostramos el resultado
    }
    
}
