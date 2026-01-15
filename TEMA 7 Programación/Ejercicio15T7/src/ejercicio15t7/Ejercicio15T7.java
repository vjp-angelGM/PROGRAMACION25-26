/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio15T7 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu() {
        System.out.println("------------- MENU DE VENTAS DE COCHES ------------");
        System.out.println("Bienvenido al menú de nuestras ventas de coches");
        System.out.println("========================================");
        System.out.println("1. Rellenar las ventas por meses ");
        System.out.println("2. Mostrar las ventas ");
        System.out.println("3. Mostrar las ventas a la inversa");
        System.out.println("4. Mostrar la suma total de las ventas anuales");
        System.out.println("5. Mostrar las ventas de los meses pares");
        System.out.println("6. Mostrar el mes con más ventas");
        System.out.println("7. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opción: ");
    }

    public static int pedirOpcion(Scanner entrada) {
        try {
            int opcion = entrada.nextInt();
            return opcion;
        } catch (InputMismatchException e) {
            entrada.nextLine();
            System.out.println(e);
        }
        return -1;
    }

    public static int[] rellenarArray() {
        int[] array = new int[12];
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(91) + 10;
        }
        return array;
    }

    public static void mostrarArray(int[] array, String[] meses) {
        System.out.println("Mostrando el contenido de las ventas: ");
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
        System.out.println("");
    }

    public static int[] invertirArray(int[] array, String[] meses) {
        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    public static void mostrarArrayInvertido(int[] array) {
        System.out.println("Mostrando el contenido de las ventas invertido: ");
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
        System.out.println("");
    }

    public static int sumaVentas(int[] array, String[] meses){
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }
    
    public static void mostrarVentasMesPar(int[] ventas, String[] meses){
        System.out.println("\n--- Ventas de Meses Pares ---");
        int sumaTotal = 0;
        for(int i = 0; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i] + " coches");
            sumaTotal += ventas[i];
        }
        System.out.println("Total ventas meses pares: " + sumaTotal + " coches");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion = 0;
        int[] array = new int[12];
        do {
            mostrarMenu();
            opcion = pedirOpcion(entrada);
            switch (opcion) {
                case 1: {
                    System.out.println("Has seleccionado rellenar el array");
                    array = rellenarArray();
                    System.out.println("El array ha sido rellenado correctamente1");
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("Has seleccionado mostrar las ventas");
                    System.out.println("");
                    mostrarArray(array,meses);
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("Has seleccionado mostrar las ventas al reves");
                    int[] arrayInvertido = invertirArray(array,meses);
                    mostrarArrayInvertido(arrayInvertido);
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("Has seleccionado mostrar la suma de todas las ventas del año");
                    int total = sumaVentas(array,meses);
                    System.out.println("La suma total de ventas del año es: "+total+" coches");
                    System.out.println("");
                    break;
                }
                case 5: {
                    System.out.println("Has seleccionado mostrar las ventas totales de los meses pares");
                    mostrarVentasMesPar(array, meses);
                    break;
                }
                case 6: {
                    System.out.println("Has seleccionado mostrar el mes con mayor numero de ventas");
                    break;
                }
                case 7: {
                    System.out.println("Has elegido salir de nuestro programa. Hasta pronto");
                    break;
                }
                default:
                    System.out.println("Opcion introducida no valida");
            }
        } while (opcion != 7);
    }

}
