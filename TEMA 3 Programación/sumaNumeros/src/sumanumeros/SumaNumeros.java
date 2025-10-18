/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumanumeros;
import java.util.Scanner;
import  java.util.InputMismatchException;
/**
 *
 * @author angel
 */
public class SumaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner entrada = new Scanner (System.in);
        System.out.println("------------- SUMA DE NUMEROS ---------------");
        try {
            System.out.println("Introduce el primer numero:");
            num1 = entrada.nextInt();
            
            System.out.println("Introduce el segundo numero: ");
            num2 = entrada.nextInt();
            
            resultado = num1 + num2;
            System.out.println(num1 + " + "+ num2 + " = "+ resultado);
            
        } catch ( java.util.InputMismatchException e){
            System.out.println("Has introducido un dato inválido");
            System.out.println(e);
        }
    }
    
}
