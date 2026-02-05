/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t8;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio1T8 {

    /**
     * @param args the command line arguments
     */
    public static double calcularNotaMedia(Asignatura[] asignaturas) {
        double suma = 0;
        for (Asignatura asignatura : asignaturas) {
            suma += asignatura.getNota();
        }
        return suma / asignaturas.length;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el array con las 6 asignaturas del Ciclo DAM
        Asignatura[] asignaturas = new Asignatura[6];

        // Inicializamos cada asignatura con el constructor vacío
        asignaturas[0] = new Asignatura();
        asignaturas[0].setNombre("Programación");

        asignaturas[1] = new Asignatura();
        asignaturas[1].setNombre("Lenguajes de Marcas");

        asignaturas[2] = new Asignatura();
        asignaturas[2].setNombre("Bases de Datos");

        asignaturas[3] = new Asignatura();
        asignaturas[3].setNombre("Entornos de Desarrollo");

        asignaturas[4] = new Asignatura();
        asignaturas[4].setNombre("Sistemas Informáticos");

        asignaturas[5] = new Asignatura();
        asignaturas[5].setNombre("Formación y Orientación Laboral");

        // Pedimos al usuario que introduzca las notas
        System.out.println("=== NOTAS - CICLO DAW ===\n");

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Por favor, introduzca la nota de "
                    + asignaturas[i].getNombre() + ": ");
            double nota = entrada.nextDouble();
            asignaturas[i].setNota(nota);
        }

        // Mostramos las notas introducidas
        System.out.println("\n=== NOTAS INTRODUCIDAS ===");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura);
        }

        // Calculamos y mostramos la nota media
        double notaMedia = calcularNotaMedia(asignaturas);
        System.out.println("\nSu nota media del curso es de: " + notaMedia);

        entrada.close();
    }
}
