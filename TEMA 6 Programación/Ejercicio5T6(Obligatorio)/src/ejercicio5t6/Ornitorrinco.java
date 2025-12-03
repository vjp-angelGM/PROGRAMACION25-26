/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author angel
 */
public class Ornitorrinco extends Mamifero implements Oviparo {

    private int numHuevos;

    public Ornitorrinco() {
        super();
        this.numHuevos = 0;
    }

    public Ornitorrinco(String nombre, String color, String sexo, int edad, int numHuevos) {
        super(nombre, color, sexo, edad);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    @Override
    public String obtenerMensajeOvi() {
        return "Ornitorrinco: soy un mamifero oviparo. Pongo huevos";
    }

    @Override
    public void ponerHuevos() {
        numHuevos++;
        System.out.println(getNombre() + " ha puesto un huevo. Total Huevos: " + numHuevos);
    }

    @Override
    public void incubar() {
        if (numHuevos > 0) {
            numHuevos--;
            System.out.println(getNombre() + " ha incubado un huevo. Huevos restantes: " + numHuevos);
        } else {
            System.out.println(getNombre() + " no le quedan huevos para incubar");
        }
    }

    @Override
    public int mostrarNumHuevos() {
        return numHuevos;
    }

    
}
