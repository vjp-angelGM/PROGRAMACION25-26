/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparar;

/**
 *
 * @author angel
 */
public class comparar {

    public static int compararNum(int num1, int num2, int num3) {
        int mayor;
        if (num1 >= num2 && num1 >= num3) { // Comnparamos los numeros 1 y 2 y también el 1 y 3
            mayor = num1;
            System.out.println("El mayor es: " + num1); // Mostramos que el 1 es el mayor en el caso de que sea cierto
        } else if (num2 >= num1 && num2 >= num3) { // Comparamos los numeros 2 y 1 y también el 2 y 3 
            mayor = num2;
            System.out.println("El mayor es: " + num2); // Mostramos que el 2 es el mayor en el caso de que se cumpla 
        } else {
            mayor = num3;
            System.out.println("El mayor es: " + num3); // Si no se cumple ninguna de las condiciones anteriores será el tercer número el mayor de todos
        }
        return mayor;
    }
}
