/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t6;

/**
 *
 * @author angel
 */
public class Ejercicio10T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lavadora = new Electrodomestico(1.5f, 0.20f, "A++");
        Electrodomestico frigorifico = new Electrodomestico(2.0f, 0.20f, "A+");
        Electrodomestico horno = new Electrodomestico(3.0f, 0.20f, "B");

        float horasUso = 10;

        mostrarResultados("Lavadora", lavadora, horasUso);
        mostrarResultados("Frigorífico", frigorifico, horasUso);
        mostrarResultados("Horno", horno, horasUso);
    }

    private static void mostrarResultados(String nombre, Electrodomestico e, float horas) {
        System.out.println("Electrodoméstico: " + nombre);
        System.out.println("Consumo: " + e.calcularConsumo(horas) + " kWh");
        System.out.println("Factura: " + e.calcularFactura(horas) + " €");
        System.out.println("-----------------------------");
    }
}
