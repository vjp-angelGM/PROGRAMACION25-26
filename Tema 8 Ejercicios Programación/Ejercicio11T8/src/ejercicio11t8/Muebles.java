/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t8;

/**
 *
 * @author angel
 */
public class Muebles {

    private double precio;
    private String descripcion;

    public Muebles() {
        this.precio = 0.0;
        this.descripcion = "";
    }
    
    public Muebles(double precio, String descripcion){
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return "Mueble: "+" precio: "+precio+" €" +", descripcion: "+descripcion;
    }
}
