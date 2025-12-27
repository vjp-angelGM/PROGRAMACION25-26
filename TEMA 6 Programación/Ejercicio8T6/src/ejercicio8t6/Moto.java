/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8t6;

/**
 *
 * @author angel
 */
public class Moto extends Vehiculo {
   private boolean hacerCaballito;
    
    public Moto(){
        super();
        this.hacerCaballito = false;
    }
    
    public Moto(int velocidad){
        super(velocidad);
        this.hacerCaballito = hacerCaballito;
    }
    
    @Override
    public void mostrarMovimiento(){
        System.out.println("La moto está circulando a "+velocidad+" km/h");
    }
    
    public void hacerCaballito(){
        if(!hacerCaballito){
            hacerCaballito = true;
            velocidad += 15;
            System.out.println("La moto está haciendo un caballito. La velocidad actual es: "+velocidad);
        }else {
            System.out.println("La moto está haciendo un caballito");
        }
    }
}
