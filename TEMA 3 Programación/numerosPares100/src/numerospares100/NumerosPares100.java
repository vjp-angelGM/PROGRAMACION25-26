/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares100;

/**
 *
 * @author angel
 */
public class NumerosPares100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0; //Inicializo la variable num en 0
        while (num <=100){ //Inicializo el bucle y le doy la condicion de que mientras el número sea menor o igual a 100
            if (num % 2==0){ // Si el número es divisible por dos
                System.out.println(num); //Lo imprime por pantalla
            }
            num++; //Suma el número y repite vuelta
        }
    }
    
}
