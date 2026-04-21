/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio1T12 {

    final static ArrayList<Contacto> agenda = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static String pedirNombre() throws InputMismatchException {
        System.out.println("Nombre: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void addContacto() throws InputMismatchException {
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Añadir nuevo contacto: ");
            String nombre = pedirNombre();
            int edad = pedirEdad();
            int nTel = pedirNum();
            Contacto c = new Contacto(nombre, edad, nTel);
            agenda.add(c);
            System.out.println("Contacto guardado con éxito");
            System.out.println("");
            System.out.println("¿Desea guardar otro contacto? (s/n)");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

    }

    public static int pedirEdad() throws InputMismatchException {
        System.out.println("Edad: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int pedirNum() throws InputMismatchException {
        System.out.println("Número de teléfono: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void verContacto(ArrayList<Contacto> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacia");
        } else {
            System.out.println("===== Lista de contactos =====");
            agenda.forEach(System.out::println);
        }
    }

    public static void deleteContacto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el móvil que quieres eliminar");
        int telBuscado = entrada.nextInt();
        entrada.nextLine();
        boolean eliminado = agenda.removeIf(c -> c.getnTelefono() == telBuscado);

        if (eliminado) {
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("No se ha encontrado un contacto con ese número");
        }
    }

    public static void showContactoEdad(ArrayList<Contacto> agenda) {
        agenda.sort(Comparator.comparingInt(Contacto::getEdad));
        verContacto(agenda);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("============= MENU ==============");
            System.out.println(" == Bienvenido al menú de la agenda ==");
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Añadir un contacto a la agenda");
            System.out.println("2. Ver los contactos de la agenda");
            System.out.println("3. Eliminar contactos de la agenda");
            System.out.println("4. Mostrar los contactos ordenados por su edad");
            System.out.println("5. Salir del programa");
            System.out.println("\n");
            System.out.println("Selecciona una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    addContacto();
                    break;
                case 2:
                    verContacto(agenda);
                    break;
                case 3:
                    deleteContacto();
                    break;
                case 4:
                    showContactoEdad(agenda);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo");
            }
        } while (opcion != 5);
    }

}
