/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;
import java.util.Scanner;
import division.division;
/**
 *
 * @author angel
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, resto;  // Declaro las variables numero y resto que son con las que voy a operar
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: "); // Le pedimos al usuario el número
        numero = entrada.nextInt(); // Leemos dicho numero 
        
        numero = division.division(numero);
        
    }
    
}
