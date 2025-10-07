/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productosuma;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 04/10/2025
 * Ejercicio 2 
 * TEMA 3 PROGRAMACIÓN
 */
public class ProductoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables 
        int num1, num2, suma, producto,opcion;
        
        // Hago el Scanner para luego poder recoger las opciones 
        Scanner entrada = new Scanner (System.in);
        
        //Pido el primer numero al usuario
        System.out.println("Por favor introduce el primer número: ");
        num1 = entrada.nextInt();
        
        //Pido el segundo numero al usuario
        System.out.println("Por favor introduce el segundo número: ");
        num2 = entrada.nextInt();
        
        //Muestro el menú antes de seleccionar una opción 
        System.out.println("---------- Menú de opciones -------");
        System.out.println("-------------- 1. Suma ------------------");
        System.out.println("-------------- 2. Producto -------------");
        System.out.println("Introduce ahora una opción: ");
        opcion = entrada.nextInt();
        
        //Comprobamos la opción seleccionada 
        switch (opcion){
            case 1:{ // Si elige la primera opción mostramos la suma
                System.out.println("1. Suma");
                suma = num1 + num2;
                System.out.println("Has elegido sumar los números y dan como resultado: "+suma);
                break; // Salimos y finaliza el programa
            }
            case 2:{ // Si elige la segunda opción mostramos el producto
                System.out.println("2. Producto");
                producto = num1 * num2;
                System.out.println("Has elegido multiplicar los números y dan como resultado: "+producto);
                break; // Salimos y finaliza el programa
            }
            default: { // Este mensaje lo muestra si no coincide ninguna de las opciones que hay en el menú y vuelve a pedir que seleccionemos una de ellas
                System.out.println("La opción seleccionada no existe. Por favor selecciona otra opción.");
            }
        }
    }
    
}
