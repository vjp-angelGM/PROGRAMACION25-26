/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares2;

/**
 *
 * @author angel
 */
public class NumerosPares2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 11; //Declaro e inicializo la variable num a 11
        while (num <=133){ //Inicializo el bucle 
            if (num %2 == 0){ //Le doy una condición de que si el número es divisible entre dos
                System.out.println(num); // Imprime el número
            }
            num++; //Le vuelve a repetir el bucle
        }
    }
    
}
