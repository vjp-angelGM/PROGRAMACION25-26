/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio6T12 {

    /**
     * @param args the command line arguments
     */
    static String NOMBREF = ""; //Declaro una constante para poder guardar el nombre del fichero

    
    //Método que muestra el menú al usuario
    public static void mostrarMenu() {
        System.out.println("======= MENU DE OPCIONES DE FICHERO =======");
        System.out.println("1. Volcar el fichero de los pares");
        System.out.println("2. Leer el fichero con los pares");
        System.out.println("3. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opcion: ");
    }

    //Método que vuelca el contenido del fichero que se genera 
    //con el nombre que le pone el usuario
    public static void volcarFichero() throws IOException {
    Scanner entrada = new Scanner(System.in);
    int[] pares = new int[100];
    for (int i = 0; i < pares.length; i++) { //Recorre el array 
        pares[i] = i * 2;
    }

    System.out.print("Introduce el nombre del fichero: ");//Le pide el nombre del fichero al usuario
    NOMBREF = entrada.nextLine(); 
    try (PrintWriter pw = new PrintWriter(new FileWriter(NOMBREF))) {
        int i = 1;
        for (int n : pares) {
            pw.println(i + " -> " + n);
            i++;
        }
        System.out.println("Fichero guardado.");
    }
}

    public static void leerFichero() {//Método que lee el contenido del fichero
    try (BufferedReader br = new BufferedReader(new FileReader(NOMBREF))) {
        String linea;
        while ((linea = br.readLine()) != null) { 
            System.out.println(linea);
        }
    } catch (IOException e) {
        System.out.println("Error al leer: " + e.getMessage());
    }
}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] pares = new int[100];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }

        int opcion;
        try {
            do {
                mostrarMenu();
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        volcarFichero();
                        break;
                    case 2:
                        leerFichero();
                        break;
                    case 3:
                        System.out.println("SALIENDO DEL PROGRAMA.");
                        break;
                    default:
                        System.out.println("Opción introducida no válida");
                }

            } while (opcion != 3);
        } catch (FileNotFoundException e) {
            System.out.println("Error. Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado " + e.toString());
        }
    }
}
