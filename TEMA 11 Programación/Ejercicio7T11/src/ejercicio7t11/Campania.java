/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t11;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Campania {

    private String nombre;
    private ArrayList<Donacion> donacion;
    
    public Campania(String nombre, ArrayList<Donacion> donacion) {
        this.nombre = nombre;
        this.donacion = donacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Donacion> getDonacion() {
        return donacion;
    }

    
    
    
}
