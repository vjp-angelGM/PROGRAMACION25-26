/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8t6;

/**
 *
 * @author angel
 */
public class Coche extends Vehiculo {

    private boolean aireEncendido;

    public Coche() {
        super();
        this.aireEncendido = false;
    }

    public Coche(int velocidad) {
        super(velocidad);
        this.aireEncendido = aireEncendido;
    }

    public boolean getAire() {
        return aireEncendido;
    }

    public void setAire(boolean aireEncendido) {
        this.aireEncendido = aireEncendido;
    }

    @Override
    public void mostrarMovimiento() {
        int velocidadActual = getVelocidad();
        System.out.println("El coche está circulando a " + velocidadActual + " km/h");
    }

    public void encenderAire() {
        if (this.aireEncendido == false) {
            this.aireEncendido = true;
            System.out.println("El coche ha cencendido el aire. La velocidad se reduce");
            this.velocidad = this.velocidad - 10;
        } else {
            System.out.println("El aire ya está encendido");
        }
    }
}
