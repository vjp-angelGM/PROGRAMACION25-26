/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio14T7 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu() {
        System.out.println("============ Menu de temperaturas ==========");
        System.out.println("Bienvenido al menú de mosttrar las temperaturas");
        System.out.println("===========================================");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media");
        System.out.println("4. Día o días más calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opción: ");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        try {
            int opcion = entrada.nextInt();
            return opcion;
        } catch (InputMismatchException e) {
            entrada.nextLine();
            System.out.println(e);
        }
        return -1;
    }

    public static int[][] rellenarArray(int array[][], String[] dias) {
        System.out.println("Rellenando las temperaturas del mes: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = pedirTemp(i, j, dias);
            }
        }
        return array;
    }

    public static int pedirTemp(int fila, int columna, String[] dias) {
        Scanner entrada = new Scanner(System.in);
        //Mostramos el mensaje al usuario que introduzca el número para la posición que muestra
        System.out.println("Introduce la temperatura para la semana " + (fila + 1) + " , " + dias[columna] + " : ");
        //Retorna la entrada del usuario
        return entrada.nextInt();
    }

    public static void mostrarArray(int[][] array, String[] dias) {
    System.out.println("Mostrando las temperaturas del mes:");
    
    for (int i = 0; i < array.length; i++) {
        System.out.println("Semana : "+(i+1)+": ");
        for (int j = 0; j < array[i].length; j++) {
            System.out.println(" "+dias[j]+": "+array[i][j]+"ºC");
            if (j < array[i].length - 1) {  
                System.out.print(" ");
            }
        }
    }
}

    public static void mostrarTemperaturaMedia(int[][] array) {
        int suma = 0;
        int totaldias = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];
                totaldias++;
            }
        }
        double media = suma / 28.0;
        System.out.println("La temperatura media del mes es: " + media+" ºC ");
    }

    public static void mostrarDiaCaluroso(int [][] array, String [] dias){
        int tempMax = array [0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > tempMax){
                    tempMax = array[i][j];
                }
            }
        }
        System.out.println("Temperatura máxima: "+tempMax+" ºC");
        System.out.println("El dia o días más calurosos fueron: ");
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == tempMax){
                    System.out.println("-> "+dias[j]+" de la semana "+(i+1));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion = 0;
        int[][] array = new int[4][7];
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1: {
                    System.out.println("Has seleccionado rellenar las temperaturas");
                    rellenarArray(array, dias);
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("Has seleccionado mostrar las temperaturas");
                    System.out.println("");
                    mostrarArray(array, dias);
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("Has seleccionado mostrar la temperatura media del mes");
                    mostrarTemperaturaMedia(array);
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("Has seleccionado mostrar el/los dia/s más calurosos del mes");
                    mostrarDiaCaluroso(array,dias);
                    System.out.println("");
                    break;
                }
                case 5: {
                    System.out.println("Has seleccionado salir del programa. Hasta pronto!!!");
                    break;
                }
                default:
                    System.out.println("Opcion introducida no valida");
            }

        } while (opcion != 5);
    }
}
