/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author angel
 */
public abstract class Animal {

    private String nombreComun;
    private String categoria;
    private String sonido;
    private String alimentacion;
    private String habitat;
    private String nombreCientifico;

    public Animal(String nombreComun, String categoria, String sonido,
            String alimentacion, String habitat, String nombreCientifico) {
        this.nombreComun = nombreComun;
        this.categoria = categoria;
        this.sonido = sonido;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    public void mostrarCaracteristicas() {
        System.out.println("----- " + nombreComun + " -----");
        System.out.println("Categoría: " + categoria);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Nombre científico: " + nombreCientifico);
    }

    public void emitirSonido() {
        System.out.println(nombreComun + " emite: " + sonido);
    }

}
