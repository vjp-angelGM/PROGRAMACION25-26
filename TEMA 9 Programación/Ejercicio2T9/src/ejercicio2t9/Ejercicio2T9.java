/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t9;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Ejercicio2T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = entrada.nextLine();
        
        System.out.println("Caracteres de la cadena:  ");
        for (int i = 0; i < cadena.length(); i++){
            char carac = cadena.charAt(i);
            System.out.print(carac+" - ");
        }
    }
    
}
