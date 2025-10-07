/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativo;
import java.util.Scanner;
/*
 *
 * @author angel
 * @since 04/10/2025
 * Ejercicio 1 Tema 3 
 * TEMA 3 PROGRAMACIÓN
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // Declaro la variable numero
        Scanner entrada = new Scanner (System.in); // Pongo el Scanner para poder introducir luego el valor del numero
        System.out.println("Por favor, introduce un número: "); // Ponemos el Sout con el mensaje a mostrar 
        num = entrada.nextInt(); // Recogemos el valor que ha introducido el usuario
        
        if (num < 0)// Le digo que si el numero introducido es menor de 0 
            System.out.println("El número es negativo"); //Me muestra este mensaje
        else
            System.out.println("El número es positivo");// Si es mayor de 0 me muestra este 
    }
    
}
