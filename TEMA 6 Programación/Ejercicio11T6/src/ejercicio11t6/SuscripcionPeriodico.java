/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t6;

/**
 *
 * @author angel
 */
public class SuscripcionPeriodico extends Suscripcion {
    public SuscripcionPeriodico(float precio){
        this.precioBase = precio;
    }
    
    @Override
    public float calcularPrecio(){
        return this.precioBase * 1.10f;
    }
    
    
}
