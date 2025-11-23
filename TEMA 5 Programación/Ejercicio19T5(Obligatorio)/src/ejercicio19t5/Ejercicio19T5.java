/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19t5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio19T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pedro", 40.0, 20.0);
        Empleado empleado1 = new Empleado("Marcos", 20.0, 31.0);
        Empleado empleado2 = new Empleado("Juan", 40.0, 28.0);

        System.out.println("El empleado " + empleado.getNombre() + " trabaja " + empleado.getHoras() + " horas,cobra " + empleado.getTarifa() + " euros la hora por lo que le corresponde un sueldo de " + empleado.getsueldoBruto());
        System.out.println("El empleado " + empleado1.getNombre() + " trabaja " + empleado1.getHoras() + " horas,cobra " + empleado1.getTarifa() + " euros la hora por lo que le corresponde un sueldo de " + empleado1.getsueldoBruto());
        System.out.println("El empleado " + empleado2.getNombre() + " trabaja " + empleado2.getHoras() + " horas,cobra " + empleado2.getTarifa() + " euros la hora por lo que le corresponde un sueldo de " + empleado2.getsueldoBruto());

    }

}
