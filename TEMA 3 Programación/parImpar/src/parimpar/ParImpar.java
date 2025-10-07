/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;
import java.util.Scanner; // Importo la libreria de java.util
/**
 *
 * @author angel
 * @since 06/10/2025
 * TEMA 3 PROGRAMACION
 * PAR O IMPAR
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, resto;  // Declaro las variables numero y resto que son con las que voy a operar
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: "); // Le pedimos al usuario el número
        numero = entrada.nextInt(); // Leemos dicho numero 
        
        if (numero %2 == 0){ // SI se cumple la condicion de que sea el resto de la división igual a 0 
            System.out.println("El numero es par. "); // Muestra esto
        }else { // SI NO es resto de la división igual a 0
            System.out.println("El numero es impar. "); // Muestra esto
        }
    }
    
}
