/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auxiliar;

/**
 *
 * @author angel
 * @since 26/09/2025
 * AUXILIAR
 * TEMA 2 PROGRAMACIÓN
 */
public class Auxiliar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 4; //Declaro num1 y la inicializo
        int num2 = 5; //Declaro num2 y la inicializo
        int aux; //Declaro la variable auxiliar
        System.out.println("La variable num1 contiene "+num1+" y la variable num2 contiene: "+num2); //Muestro el estado inicial
        aux = num1; //
        num1 = num2; // -> Hacemos el intercambio de las variables entre si  
        num2 = aux;// 
        System.out.println("Ahora la variable num1 contiene "+num1+" y la variable num2 contiene "+num2); //Muestro el estado final
    }
    
}
