/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio3T10 {
public static void rellenarArrayList(ArrayList<Integer> numero){
    Scanner entrada = new Scanner (System.in);
    int num;
    String opcion;
    do {
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        entrada.nextLine();
        numero.add(num);
        
        System.out.println("Quieres introducir otro numero? (si/no)");
        opcion = entrada.nextLine();
    }while (opcion.equalsIgnoreCase("si"));
}

public static void mostrarArrayList(ArrayList<Integer> numero){
    System.out.println("ArrayList de números ");
     for (int i = 0; i < numero.size(); i++) {
            System.out.print(numero.get(i)+" - ");
        }
}
public static void intercambiarPosiciones(ArrayList<Integer> numero){
    if (numero.size() >=4){
        int aux = numero.get(1);
        numero.set(1, numero.get(3));
        numero.set(3, aux);
        System.out.println("");
        System.out.println("ArrayList despues del intercambio de posiciones : ");
        mostrarArrayList(numero);
    }else {
        System.out.println("El arrayList no tiene suficientes elementos (Minimo 4)");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        rellenarArrayList(numeros);
        mostrarArrayList(numeros);
        intercambiarPosiciones(numeros);
    }
    
}
