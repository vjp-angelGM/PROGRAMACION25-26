/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t9;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio3T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una cadena de caracteres:  ");
        String cadena = entrada.nextLine();
        
        char [] caract1 = cadena.toCharArray();
        System.out.println("Caracteres de la cadena: ");
        for (int i = 0; i < cadena.length(); i++){
            System.out.println(caract1[i]);
        }
    }
    
}
