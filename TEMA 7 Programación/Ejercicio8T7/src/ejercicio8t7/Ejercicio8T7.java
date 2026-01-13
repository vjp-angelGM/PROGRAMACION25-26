/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8t7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio8T7 {

    /**
     * @param args the command line arguments
     */
    // Creamos el método para pedir el número
    public static int pedirNum(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero de 5 cifras"); // Pedimos al usuario que nos introduzca un numero de 5 cifras
        return entrada.nextInt();
    }
   
    //Creamos el método que invierte el array
  public static int [] invertirArray(int num){
      int [] array = new int [5]; // Creamos el array de 5 posiciones 
      for (int i = 0; i < array.length; i++){ // Con el bucle vamos dandole la vuelta y colocamos las cifras dadas la vuelta
          array[(array.length - 1) - i] = num % 10;
          num /= 10;
      }
        return array;
  }
  // Creamos el método para mostrar el array 
  public static void mostrarArray(int num){
      int [] array = new int [5];
      array = invertirArray(num); // Hacemos referencia al método que invierte el array
      System.out.println("El contenido del array es : "+array[4]+array[3]+array[2]+array[1]+array[0]);
  }
    public static void main(String[] args) {
      int num;
      num = pedirNum();
      mostrarArray(num);
    }
    
}
