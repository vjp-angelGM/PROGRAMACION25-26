/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciozapatillas;

/**
 *
 * @author angel
 * @since 23/09/2025
 * EJERCICIO ZAPATILLAS 1.6 Aprueba tu examen con Schaum
 * TEMA 2 PROGRAMACIÓN
 */
public class EjercicioZapatillas {
    private final static int PRECIO = 85;
    private final static float DESCUENTO = 0.85F;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio_total = (PRECIO * DESCUENTO);
        System.out.println("El precio total de las zapatillas es: "+precio_total);
    }
    
}
