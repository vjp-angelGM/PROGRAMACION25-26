/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t7;

/**
 *
 * @author angel
 */
public class Ejercicio4T7 {

    /**
     * @param args the command line arguments
     */
    public static void numerosAleatorios(int[][] array) {
        System.out.println("Generando el array con numeros aleatorios: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (200 - 100) + 100);
            }
        }
    }

    public static void mostrarPares(int[][] array) {
        System.out.println("Mostrando numeros pares: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] array = new int [4][3];
        numerosAleatorios(array);
        mostrarPares(array);
    }

}
