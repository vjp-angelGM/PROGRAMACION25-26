/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t6;

/**
 *
 * @author angel
 */
public class SuscripcionTV extends Suscripcion{
    private static final double IVA = 0.21;
    public SuscripcionTV (float precio){
        this.precioBase = precio;
    }
    
    @Override
    public float calcularPrecio(){
        return (float) (this.precioBase * (1 + IVA));
    }
}
