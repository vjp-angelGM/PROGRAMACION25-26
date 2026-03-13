/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio5T10 {

    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Introduce un número entero: ");
            lista.add(sc.nextInt());
            System.out.print("¿Deseas introducir otro? (si/no): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("si"));
    }

    public static void mostrarLista(ArrayList<Integer> lista, String mensaje) {
        System.out.println(mensaje + " " + lista);
    }

    public static int buscarPosicionMayorPar(ArrayList<Integer> lista) {
        int posMax = -1;
        for (int i = 0; i < lista.size(); i++) {
            int n = lista.get(i);
            if (n % 2 == 0) {
                if (posMax == -1 || n > lista.get(posMax)) {
                    posMax = i;
                }
            }
        }
        return posMax;
    }
    
    public static int buscarPosicionMenorImpar(ArrayList<Integer> lista) {
        int posMin = -1;
        for (int i = 0; i < lista.size(); i++) {
            int n = lista.get(i);
            if (n % 2 != 0) {
                if (posMin == -1 || n < lista.get(posMin)) {
                    posMin = i;
                }
            }
        }
        return posMin;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(); // [1]

        rellenarLista(lista);
        mostrarLista(lista, "Lista original:");

        int posMayorPar = buscarPosicionMayorPar(lista);
        int posMenorImpar = buscarPosicionMenorImpar(lista);

        if (posMayorPar != -1 && posMenorImpar != -1) {
            System.out.println("Mayor par: " + lista.get(posMayorPar));
            System.out.println("Menor impar: " + lista.get(posMenorImpar));
        } else {
            System.out.println("No se han encontrado suficientes números pares o impares.");
        }
    }

}
