/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author angel
 */
public class Campania {
    private String nombre;
    private ArrayList<Donacion> donaciones;
 
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new ArrayList<>();
    }
 
    public String getNombre() {
        return nombre;
    }
 
    // 1. Añadir donación
    public void añadirDonacion(Donacion d) {
        donaciones.add(d);
    }
 
    // 2. Mostrar donaciones
    public void mostrarDonaciones() {
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas.");
            return;
        }
        System.out.println("--- Donaciones de la campaña: " + nombre + " ---");
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }
 
    // 3. Mostrar donaciones por nombre de donante
    public void mostrarDonacionesPorNombre(String nombreBuscado) {
        boolean encontrado = false;
        System.out.println("--- Donaciones de: " + nombreBuscado + " ---");
        for (Donacion d : donaciones) {
            if (d.getNombreDonante().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron donaciones para ese donante.");
        }
    }
 
    // 4. Mostrar número de donaciones
    public void mostrarNumeroDonaciones() {
        System.out.println("Número de donaciones: " + donaciones.size());
    }
 
    // 5. Mostrar total dinero recaudado
    public void mostrarTotalRecaudado() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        System.out.println("Total recaudado: " + total + "€");
    }
 
    // 6. Ordenar donaciones de mayor a menor importe (sin Burbuja)
    public void ordenarDonaciones() {
        Collections.sort(donaciones, new Comparator<Donacion>() {
            @Override
            public int compare(Donacion d1, Donacion d2) {
                return Double.compare(d2.getCantidad(), d1.getCantidad());
            }
        });
        System.out.println("Donaciones ordenadas de mayor a menor importe.");
    }
}