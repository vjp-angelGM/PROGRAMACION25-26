/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t6;

/**
 *
 * @author angel
 */
public class Ejercicio9T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Crear objetos Persona
        Persona persona1 = new Persona("12345678A", 15000);
        Persona persona2 = new Persona("87654321B", 45000);
        Persona persona3 = new Persona("11111111C", 350000);

        // Crear objetos Vehiculo
        Vehiculo vehiculo1 = new Vehiculo(900, "1234-ABC", "12345678A");
        Vehiculo vehiculo2 = new Vehiculo(1200, "5678-DEF", "87654321B");
        Vehiculo vehiculo3 = new Vehiculo(3500, "9999-XYZ", "11111111C");

        // Mostrar información y calcular impuestos
        System.out.println("=== PERSONAS ===");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println("\n=== VEHICULOS ===");
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculo3);

        System.out.println("\n=== MODIFICANDO DATOS ===");
        persona1.setIngresos(25000);
        System.out.println("Persona1 tras cambiar ingresos: " + persona1);

        vehiculo1.setCC(1600);
        System.out.println("Vehiculo1 tras cambiar cc: " + vehiculo1);
    }
}
