/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t8;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio6T8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== SISTEMA DE GESTIÓN DE SUELDOS ===\n");
        
        // Solicitar número de empleados
        System.out.print("¿Cuántos empleados desea registrar? ");
        int numEmpleados = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        
        // Crear array de empleados
        Empleado[] empleados = new Empleado[numEmpleados];
        
        // Rellenar información de cada empleado
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\n--- Empleado " + (i + 1) + " ---");
            
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Horas trabajadas: ");
            double horas = entrada.nextDouble();
            
            System.out.print("Tarifa por hora (euros): ");
            double tarifa = entrada.nextDouble();
            entrada.nextLine(); // Limpiar buffer
            
            // Crear objeto Empleado y guardarlo en el array
            empleados[i] = new Empleado(nombre, horas, tarifa);
        }
        
    }
}
    
    

