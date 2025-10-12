/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabladelocho;

import java.util.Scanner; //Importo la librería java.util

/**
 *
 * @author angel
 */
public class TablaDelOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, resultado; //Declaro las variables num, i y resultado
        Scanner entrada = new Scanner(System.in); //Declaro un Scanner para luego pedirle al usuario que introduzca un numero y poderlo recoger
        System.out.println("Por favor, introduzca un numero: "); // Le pedimos al usuario que introduzca un número
        num = entrada.nextInt(); //Recogemos el número
        for (i = 0; i <= 10; i++) { //Inicializamos el bucle dandole la condición de que mientras el numero de vuelta sea menor o igual a 10 que se repita 
            resultado = num * i; // Realiza la multiplicación del numero que introduce el usuario
            System.out.println(num + " x " + i + " = " + resultado); //Imprime el numero por la vuelta del bucle
        }
    }

}
