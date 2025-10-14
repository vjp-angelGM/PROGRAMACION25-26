/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosimpares2;

/**
 *
 * @author angel
 * @since 14/10/2025
 * EJERCICIO 16 
 * TEMA 3 PROGRAMACIÓN
 */
public class NumerosImpares2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 20; //Declaramos e inicializamos la variable num en 20
        int contador = 0; //Declaramos el contador 
        do { //Iniciamos el bucle 
            if (num % 2 != 0) { //Le damos esta condicion si el resto del numero es distinto de 0
                System.out.println(num); //Imprime el numero
                contador++; // Añadimos una vuelta al contador
            }
            num++; // Añadimos el numero
        } while (num <= 160); //Repetir hasta que el numero sea menor o igual a 160
        System.out.println("La cantidad de números impares han sido: " + contador); //Imprimimos el numero total de numeros impares recopilados
    }

}
