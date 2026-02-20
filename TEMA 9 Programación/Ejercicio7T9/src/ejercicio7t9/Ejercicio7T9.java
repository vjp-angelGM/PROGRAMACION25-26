/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t9;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio7T9 {

    /**
     * @param args the command line arguments
     */
    
    public static String invertir(String frase){
        String [] palabra = frase.split("");
        String resultado = "";
        
        for (int i = palabra.length - 1; i >= 0 ; i --){
            resultado+= palabra[i];
            if(i < 0){
                resultado+= " ";
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        String invertirFrase  = invertir(frase);
        System.out.println("Mostrar frase invertida: ");
        System.out.println(invertirFrase);
    }
    
}
