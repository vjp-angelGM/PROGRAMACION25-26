/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresimpares;

/**
 *
 * @author angel
 * @since 14/10/2025
 * EJERCICIO 31
 * TEMA 3 PROGRAMACIÓN
 */
public class TresImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0, impares = 0, num; //Declaramos las variables 
        
        System.out.println("Generando numeros hasta obtener 3 impares .........");// Decimos este mensaje al usuario
        
        do { //Hacemos el bucle  
            num = (int) (Math.random()* 100)+1;
            contador++;
            System.out.println("Numero generado: "+num); //Mostramos el numero generado
            
            if (num % 2 != 0){
                impares++;
                System.out.println("Impar "+impares+" de 3"); //Contador de impares 
            }
        }while (impares < 3);
        
        System.out.println("Se generaron: "+contador+" numeros en total para conseguir 3 impares."); //Mostramos los numeros generados necesarios para los impares
    }
    
}
