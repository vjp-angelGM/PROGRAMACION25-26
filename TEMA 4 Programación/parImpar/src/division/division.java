/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package division;

/**
 *
 * @author angel
 */
public class division {

    public static int division(int num) {
        int resto;
        if (num % 2 == 0) { // SI se cumple la condicion de que sea el resto de la división igual a 0 
            System.out.println("El numero es par. "); // Muestra esto
        } else { // SI NO es resto de la división igual a 0
            System.out.println("El numero es impar. "); // Muestra esto
        }
        return num;
    }

}
