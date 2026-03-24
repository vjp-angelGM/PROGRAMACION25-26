/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio6T11 {

    public static void mostrarMenu() {
        System.out.println("=========== DONACIONES ===========");
        System.out.println("== Bienvenido al menu de donaciones ==");
        System.out.println("1. Añadir donacion");
        System.out.println("2. Mostrar donacion");
        System.out.println("3, Mostrar donacion por nombre del donante");
        System.out.println("4. Mostrar numero de donaciones");
        System.out.println("5. Mostrar total de dinero recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir");
        System.out.println("");
        System.out.println("Selecciona una opción del menú: ");
    }

    /**
     * @param args the command line arguments
     */
    public static int pedirOpcion() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Elige una opción: ");
    while (!entrada.hasNextInt()) {
        System.out.print("Introduce un número válido: ");
        entrada.next();
    }
    return entrada.nextInt();
}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la campaña: ");
        String nombreCampania = entrada.nextLine();
        Campania campania = new Campania(nombreCampania);
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del donante: ");
                    String nombreD = entrada.nextLine();
                    System.out.println("Cantidad a donar: ");
                    double cantidad = entrada.nextDouble();
                    entrada.nextLine();
                    campania.añadirDonacion(new Donacion(nombreD, cantidad));
                    break;
                case 2:
                    campania.mostrarDonaciones();
                    break;
                case 3:
                    System.out.print("Introduce el nombre del donante: ");
                    String nombreBuscado = entrada.nextLine();
                    campania.mostrarDonacionesPorNombre(nombreBuscado);
                    break;
                case 4:
                    campania.mostrarNumeroDonaciones();
                    break;
                case 5:
                    campania.mostrarTotalRecaudado();
                    break;
                case 6:
                    campania.ordenarDonaciones();
                    campania.mostrarDonaciones();
                    break;
                case 7:
                    System.out.println("Saliendo del programa..... Hasta pronto!!!!");
                    break;
                default:
                    System.out.println("Error: Introduce un valor entre 1 y 7");
            }
        } while (opcion != 7);
    }
}
