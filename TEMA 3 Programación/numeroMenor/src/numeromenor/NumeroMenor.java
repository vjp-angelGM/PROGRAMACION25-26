/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromenor;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class NumeroMenor {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      int num1, num2, num3, menor;
      Scanner entrada = new Scanner (System.in);
      
        System.out.println("Introduce el primer número:  ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        num3 = entrada.nextInt();
        
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
