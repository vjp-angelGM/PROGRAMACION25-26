/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio2T10 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduce números (negativo para terminar):");
        do {
            num = entrada.nextInt();
            if (num >= 0) {
                lista.add(num); // Añade el elemento al final [4, 5]
            }
        } while (num >= 0);
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Contenido de la lista: " + lista);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);

        if (!lista.isEmpty()) { // Comprueba si hay datos antes de calcular [4]
//            System.out.println("Mayor: " + obtenerMayor(lista));
//            System.out.println("Menor: " + obtenerMenor(lista));
//            System.out.println("Suma total: " + obtenerSuma(lista));
        }
    }
}
