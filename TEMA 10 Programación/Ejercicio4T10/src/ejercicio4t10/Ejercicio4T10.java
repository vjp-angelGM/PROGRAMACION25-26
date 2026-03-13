/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio4T10 {

    public static void rellenarArrayList(ArrayList<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();

            if (num > 0) {
                numeros.add(num);
            }
        } while (num > 0);
    }

    public static void mostrarArrayList(ArrayList<Integer> numeros) {
        System.out.println("Mostrando lista ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
        }
    }

    public static boolean comprobarRepetidos(ArrayList<Integer> numeros, int num) {
        boolean repetido = false;
        if (numeros.indexOf(num) != numeros.lastIndexOf(num)) {
            repetido = true;
        }
        return repetido;
    }

    public static void sustituirRepetido(ArrayList<Integer> numeros){
        int numAc;
        for (int i = 0; i < numeros.size(); i++){
            numAc = numeros.get(i);
            if (comprobarRepetidos(numeros, numAc)){
                for (int j = 0; j < numeros.size(); j++){
                    if (numeros.get(j) == numAc){
                        numeros.set(j, 0);
                    }
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //Creamos un objeto de ArrayList con el tipo de dato de la clase envoltorio
        rellenarArrayList(numeros);
        mostrarArrayList(numeros);
        sustituirRepetido(numeros);
        mostrarArrayList(numeros);
        
    }

}
