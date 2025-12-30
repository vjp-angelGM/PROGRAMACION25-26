/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11t6;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio11T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suscripcion periodico = new SuscripcionPeriodico(30.0f);
        Suscripcion tv = new SuscripcionTV(50.0f);

        System.out.println("--- PLATAFORMA ONLINE ---");
        System.out.println("1. Suscripción Periódico (Base 30€ + 10% IVA): " + periodico.calcularPrecio() + "€");
        System.out.println("2. Suscripción TV (Base 50€ + 21% IVA): " + tv.calcularPrecio() + "€");
        System.out.print("Seleccione una opción: ");
        
        int seleccion = sc.nextInt();
        float precioFinal = (seleccion == 1) ? periodico.calcularPrecio() : tv.calcularPrecio();

        Carrito miCarrito = new Carrito(precioFinal);
        miCarrito.procesarPago(); // Ejecuta lógica de descuento y pago
    }
}
    
    

