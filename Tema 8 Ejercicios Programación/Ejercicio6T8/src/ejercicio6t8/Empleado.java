/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t8;

/**
 *
 * @author angel
 */
public class Empleado {
    private String nombre;
    private double horasTrabajadas;
    private double tarifa;
    
    public Empleado(){
        this.nombre = "";
        this.horasTrabajadas = 0.0;
        this.tarifa = 0.0;
    }
    
    public Empleado(String nombre, double horasTrabajadas, double tarifa){
        this.nombre = nombre;
        this.horasTrabajadas= horasTrabajadas;
        this.tarifa = tarifa;
    }
    
    public double SueldoBruto(){
        double sueldo = 0.0;
        if (horasTrabajadas <=40){
            sueldo = horasTrabajadas * tarifa;
        }else {
            sueldo = (40 * tarifa)+((horasTrabajadas - 40)) * 1.5;
        }
        return sueldo;
    }
    public void mostrarInformacion() {
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: " + tarifa + " euros");
        System.out.println("Sueldo bruto: " + SueldoBruto() + " euros");
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
}

