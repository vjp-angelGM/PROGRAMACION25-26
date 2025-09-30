/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroscifras;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 * NUMEROS DE 4 CIFRAS
 * TEMA 2 PROGRAMACIÓN
 */
public class NumerosCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int C1,C2,C3,C4;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero de 4 cifras: ");
        numero = entrada.nextInt();
        
        C1 = numero / 1000;
        C2 = (numero / 100) % 10;
        C3 = (numero / 10 ) % 10;
        C4 = numero % 10;
        
        System.out.println("La primera cifra es :  "+C1);
        System.out.println("La segunda cifra es :  "+C2);
        System.out.println("La tercera cifra es :  "+C3);
        System.out.println("La cuarta cifra es :  "+C4);
    }
    
}
