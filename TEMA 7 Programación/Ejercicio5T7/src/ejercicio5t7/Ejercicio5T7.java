/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio5T7 {

    /**
     * @param args the command line arguments
     */
    // Método que suma todos los elementos de la matriz
    public static int sumaNumeros(int[][] array) {
        int suma = 0;
        //Recorremos las filas de la matriz
        for (int i = 0; i < array.length; i++) {
            //Recorremos las columnas
            for (int j = 0; j < array[i].length; j++) {
                //Sumamos todo el contenido 
                suma += array[i][j];
            }
        }
        //Retornamos la suma de todo el contenido de la matriz
        return suma;
    }
//Método que rellena y recoge todo el contenido del array
    public static void rellenarArray(int[][] array) {
        //Recorremos las filas de la matriz y las vamos rellenando
        for (int i = 0; i < array.length; i++) {
            //Recorremos las columnas de la matriz y las vamos rellenando
            for (int j = 0; j < array[i].length; j++) {
                //Hacemos referencia al método de pedir número
                array[i][j] = pedirNum(i, j);
            }
        }
    }
    
//Método que pide al usuario que introduzca un número
    public static int pedirNum(int fila, int columna) {
        Scanner entrada = new Scanner(System.in);
        //Mostramos el mensaje al usuario que introduzca el número para la posición que muestra
        System.out.println("Introduce el numero para la posición [ " + fila + " ][ " + columna + " ] : ");
        //Retorna la entrada del usuario
        return entrada.nextInt();
    }

    //Método que muestra el array una vez el usuario lo ha rellenado
    public static void mostrarArray(int[][] array) {
        //Mostramos el array una vez está relleno
        System.out.println("Mostrando el array ");
        //Recorremos las filas de la matriz para irlas mostrando
        for (int i = 0; i < array.length; i++) {
            //Recorremos las columnas de la matriz para irlas mostrando
            for (int j = 0; j < array[i].length; j++) {
                //Mostramos la matriz
                System.out.print(" [ " + array[i][j] + " ]");
            }
            System.out.println("");
        }
    }
//Método que muestra cual es el menor dentro de la matriz
    public static int mostrarMenor(int[][] array) {
        //Inicializamos el array con el primer elemento para poder ir comparando
        int menor = array[0][0];
        //Recorremos las filas de la matriz para ir comparando 
        for (int i = 0; i < array.length; i++) {
            //Recorremos las columnas de la matriz para ir comparando
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < menor) {
                    //Actualizamos el valor del menor 
                    menor = array[i][j];
                }
            }
        }
        //Recogemos el menor
        return menor;
    }

    //Método que muestra cual es el mayor dentro de la matriz
    public static int mostrarMayor(int [][] array){
        //Inicializamos el array con el primer elemento para poder ir comparando
        int mayor = array[0][0];
        //Recorremos las filas de la matriz para ir comparando
        for (int i = 0; i < array.length; i++) {
            //Recorremos las columnas de la matriz para ir comparando
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > mayor) {
                    //Actualizamos el valor del mayor
                    mayor = array[i][j];
                }
            }
        }
        return mayor;
    }
    
    public static void main(String[] args) {
        int[][] array = new int[4][2];
        rellenarArray(array);
        mostrarArray(array);
        int resultado = sumaNumeros(array);
        System.out.println("La suma total es: " + resultado);
        int menor = mostrarMenor(array);
        System.out.println("El menor es: "+menor);
        int mayor = mostrarMayor(array);
        System.out.println("El mayor es: "+mayor);
    }

}
