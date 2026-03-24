/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t11;

/**
 *
 * @author angel
 */
public class Donacion {

    private double importe;

    public Donacion(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Donacion{" + "importe=" + importe + '}';
    }

}
