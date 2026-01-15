/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio9T7 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: "); // Pedimos al usuario que nos introduzca un numero de 5 cifras
        return entrada.nextInt();
    }

    public static int[] invertirArray(int num) {
        int[] array = new int[calcularCifras(num)]; // Creamos el array de 5 posiciones 
        for (int i = 0; i < array.length; i++) { // Con el bucle vamos dandole la vuelta y colocamos las cifras dadas la vuelta
            array[i] = num % 10;
            num /= 10;
        }
        return array;
    }

    // Creamos el método para mostrar el array 
    public static void mostrarArray(int num) {
        int[] array = new int[calcularCifras(num)];
        array = invertirArray(num); // Hacemos referencia al método que invierte el array
        System.out.print("El contenido del array es : ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
    }
public static int calcularCifras (int num){
    int cifra = 1;
    boolean calc = false;
    
    while (!calc){
        if (num>9){
            cifra++;
            num/=10;
        }else {
            calc = true;
        }
    }
    return cifra;
}
    public static void main(String[] args) {
        int num;
        num = pedirNum();
        mostrarArray(num);

    }

}
