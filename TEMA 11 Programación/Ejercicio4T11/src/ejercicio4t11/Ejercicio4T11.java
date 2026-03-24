/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t11;
import java.util.HashSet;
import java.util.LinkedHashSet;
/**
 *
 * @author angel
 */
public class Ejercicio4T11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        HashSet<String> meses1= new HashSet<>();
        LinkedHashSet<String> meses2 = new LinkedHashSet<>();

        for (String mes : meses) {
            meses1.add(mes);
            meses2.add(mes);
        }

        System.out.println("=== HashSet (sin orden garantizado) ===");
        for (String mes : meses1) {
            System.out.println(mes);
        }

        System.out.println("\n=== LinkedHashSet (mantiene orden de inserción) ===");
        for (String mes : meses2) {
            System.out.println(mes);
        }
    }
    
}
