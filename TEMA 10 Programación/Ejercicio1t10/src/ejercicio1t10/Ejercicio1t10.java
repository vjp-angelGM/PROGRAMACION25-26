/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio1t10 {

    /**
     * @param args the command line arguments
     */
    public static void rellenar(ArrayList<String> listaNombres) {
        Scanner entrada = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Introduce el nombre: ");
            String nombre = entrada.nextLine();
            listaNombres.add(nombre);

            System.out.println("¿Quieres introducir otro nombre? (si/no)");
            opcion = entrada.nextLine();
        } while (opcion.equalsIgnoreCase("si"));
    }
    
    public static void mostrar(ArrayList<String>listaNombres){
        System.out.println("Lista de personas");
        for (String p: listaNombres){
            System.out.println(" ->  "+p);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();
        rellenar(personas);
        mostrar(personas);
    }

}
