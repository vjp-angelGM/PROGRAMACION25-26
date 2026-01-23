/*xºº   
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t7;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Ejercicio7T7 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarArray(int[] array) {
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(14) + 1;
        }
    }
    
     
   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
