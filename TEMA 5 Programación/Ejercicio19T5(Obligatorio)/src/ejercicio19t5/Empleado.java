/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19t5;

/**
 *
 * @author angel
 */
public class Empleado {

    private String nombre;
    private double horas;
    private double tarifa;

    public Empleado() {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    public Empleado (String nombre, double horas, double tarifa){
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getsueldoBruto() {
        double horasN = Math.min(horas, 40.0);
        double horasEx = Math.max(horas - 40.0, 0.0);

        double pagoN = horasN * tarifa;
        double pagoEx = horasEx * tarifa * 1.5;

        return pagoN + pagoEx;
    }
    
}
