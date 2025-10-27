/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabladelocho2;

/**
 *
 * @author angel
 */
public class Tabla {
    public static int MostrarTabla (int num, int i, int resultado){
          for (i = 0; i <= 10; i++) { //Inicializamos el bucle dandole la condición de que mientras el numero de vuelta sea menor o igual a 10 que se repita 
            resultado = num * i; // Realiza la multiplicación del numero que introduce el usuario
            System.out.println(num + " x " + i + " = " + resultado); //Imprime el numero por la vuelta del bucle
        }return resultado;
    }
}
