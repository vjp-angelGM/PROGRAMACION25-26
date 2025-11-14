/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author angel
 */
public class Ciclista {
//ATRIBUTOS

    private String nombre;
    private String tipo;
    private int dorsal;

    public Ciclista() {
        this.nombre ="";
        this.dorsal = 0;
        this.tipo = "";
    }
    
    public Ciclista (String nombre, String tipo, int dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.tipo = tipo;
    }
    
    public String getNombre(){
        return this.nombre ;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    @Override
    public  String toString(){
        return this.nombre+ "(Dorsal "+this.dorsal+" )"+this.tipo;
    }
}
