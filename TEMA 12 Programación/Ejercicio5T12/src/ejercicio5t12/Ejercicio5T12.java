/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t12;

import java.io.BufferedReader;
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
public class Ejercicio5T12 {

    /**
     * @param args the command line arguments
     */
    public static void addContactoFichero() {
        Scanner entrada = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(new FileWriter("agenda.txt", true))) {
            System.out.println("Introduce el nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Introduce la edad: ");
            int edad = entrada.nextInt();
            System.out.println("Introduce el telefono: ");
            int tel = entrada.nextInt();
            pw.println(nombre + " , " + edad + " , " + tel);
            System.out.println("Contacto agregado correctamente");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }

    public static void mostrarContenidoFichero() {
        try (BufferedReader br = new BufferedReader(new FileReader("agenda.txt"))) {
            String linea;
            System.out.println("\n--- CONTENIDO DE LA AGENDA ---");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo 'agenda.txt' aún no ha sido creado.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("");
            System.out.println(" ======== MENU ========");
            System.out.println("=== Bienvenido al menú de la agenda ===");
            System.out.println("1. Añadir un contacto al fichero de agenda");
            System.out.println("2. Mostrar el contenido del fichero ");
            System.out.println("3. Salir del programa");
            System.out.println("");
            System.out.println("Selecciona una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    addContactoFichero();
                    break;
                case 2:
                    mostrarContenidoFichero();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. Hasta pronto");
                    break;
                default:
                    System.out.println("Opción introducida no válida");
            }
        } while (opcion != 3);
    }

}
