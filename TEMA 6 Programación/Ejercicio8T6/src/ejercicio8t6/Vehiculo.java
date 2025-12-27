/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8t6;

/**
 *
 * @author angel
 */
public abstract class Vehiculo {

 int velocidad;

    public Vehiculo() {
        this.velocidad = 0;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public int setVelocidad(int velocidad){
        return velocidad;
    }
    
    public abstract void mostrarMovimiento();
    
}
