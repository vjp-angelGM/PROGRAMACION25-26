/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;
import java.util.Scanner;
import comparar.comparar;
/**
 *
 * @author angel
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3; // Declaramos las variables 
        Scanner entrada = new Scanner(System.in); // Hacemos el Scanner 

        System.out.println("Introduce el primer número:  "); // Pedimos que introduzca el primer numero
        num1 = entrada.nextInt(); // Recogemos el valor del primer numero

        System.out.println("Introduce el segundo número: "); // Pedimos que introduzca el segundo numero
        num2 = entrada.nextInt(); // Recogemos el valor del segundo numero

        System.out.println("Introduce el tercer número: "); // Pedimos que introduzca el tercer numero
        num3 = entrada.nextInt(); // Recogemos el valor del tercer numero
        
        int mayor;
        mayor = comparar.compararNum(num1, num2, num3);
    }
    

}
