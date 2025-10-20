/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromenor;
import java.util.Scanner; // Importamos la libreria Scanner 

/**
 *
 * @author angel
 */
public class NumeroMenor {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      int num1, num2, num3, menor; // Declaramos las variables 
      Scanner entrada = new Scanner (System.in); // Declaramos el Scanner 
      
        System.out.println("Introduce el primer número:  "); // Le pedimos el número al usuario
        num1 = entrada.nextInt(); // Recogemos el número 
        
        System.out.println("Introduce el segundo número: "); // Le pedimos el número al usuario
        num2 = entrada.nextInt(); // Recogemos el número 
        
        System.out.println("Introduce el tercer número: ");// Le pedimos el número al usuario 
        num3 = entrada.nextInt(); // Recogemos el número 
        
        if (num1 <= num2 && num1 <= num3){
            menor = num1;
            System.out.println("El menor es: "+num1);
        }else if  (num2 <= num1 && num2 <= num3){
            menor = num2;
            System.out.println("El menor es: "+num2);
        }else {
            menor = num3;
            System.out.println("El menor es: "+num3);
        }
    }
}
