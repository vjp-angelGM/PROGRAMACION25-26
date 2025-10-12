/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raizcuadrada;
import java.util.Scanner; //Importo la libreria java.util.Scanner 

/**
 *
 * @author angel
 */
public class RaizCuadrada {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int num; //Declaro la variable num
        Scanner raiz = new Scanner(System.in); //Declaro la variable Scanner y la llamo raiz 
        do{ //Inicializo el bucle
            System.out.println("Introduce un numero: "); //Le pido un numero al usuario
            num=raiz.nextInt(); //Recojo el número
            
            if(num<0){ // Si el numero es menor que 0
                System.out.println("El numero no puede ser negativo"); //Le muestro el mensaje de error
            }
        }while(num<0); //Mientras el numero sea menor de 0 se va a seguir repitiendo
        System.out.println("La raiz cuadrada de "+num+" es "+ (float) Math.sqrt(num)); //Imprime por pantalla el resultado 
    }
    
}
