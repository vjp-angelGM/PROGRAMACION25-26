/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t11;

import java.util.TreeMap;
import java.util.LinkedHashMap;

/**
 *
 * @author angel
 */
public class Ejercicio5T11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        TreeMap<Integer, String> meses1 = new TreeMap<>();
        LinkedHashMap<Integer, String> meses2 = new LinkedHashMap<>();

        for (int i = meses.length - 1; i >= 0; i--) {
            meses1.put(i + 1, meses[i]); 
            meses2.put(i + 1, meses[i]);
        }
        System.out.println("TreeMap (Ordenado por clave):");
        meses1.forEach((k, v) -> System.out.println(k + " " + v)); 
        
        System.out.println("\nLinkedHashMap (Orden de inserción - del revés):");
        meses2.forEach((k, v) -> System.out.println(k + " " + v)); 
    }

}
