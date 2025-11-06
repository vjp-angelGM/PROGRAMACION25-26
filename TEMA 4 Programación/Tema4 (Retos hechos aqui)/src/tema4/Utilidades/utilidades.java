/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.Utilidades;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author angel
 */
public class utilidades {
    /**
     * Método que pide al usuario un número
     * 
     * @return el número escrito por el usuario
     */
    public static int pedirNumero() {
        int num = -1;
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escribe un número: ");
            num = entrada.nextInt();                        
        } catch(InputMismatchException e) {
            System.out.println("Has introducido un valor no válido");
        }
        
        return num;
    }
    
    /**
     * @param a: letra inicio de rango
     * @param b: letra fin de rango
     * @return la letra aleatoria
     */
    public static char generarLetra(char a, char b) {
        int num;

        // Convierto las letras a su código ASCII (número entero)
        int inicioRango = (int)a;
        int finRango = (int)b;        
                
        // Creo un número aleatorio entre el inicio y fin del rango
        num = (int)(Math.random() * (finRango + 1 - inicioRango) + inicioRango);
        
        // Devuelvo el número convertido a char
        return (char)num;        
    }
}