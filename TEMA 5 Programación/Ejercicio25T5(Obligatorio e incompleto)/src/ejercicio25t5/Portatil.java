/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t5;

/**
 *
 * @author angel
 */
public class Portatil extends Ordenador {
    private double tamanoPantalla;
    private int peso;
    private String marca;
    
    public Portatil(){
        super();
        this.tamanoPantalla = 14.5;
        this.marca="";
        this.peso=0;
    }
    
    public Portatil(double tamanoPantalla, int peso, String marca,int memRam, int capDisco, String modelGPU, double precio, String modelCPU){
        super();
        this.marca = marca;
        this.peso = peso;
        this.tamanoPantalla = tamanoPantalla;
        
    }
    public double getTamanoPantalla(){
        return tamanoPantalla;
    }
    
    public void setTamanoPantalla(double tamanoPantalla){
        this.tamanoPantalla = tamanoPantalla;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso (int peso){
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "Este portatil es "+this.marca+" tiene un peso de "+this.peso+" y tiene un tamaño de pantalla de "
               +this.tamanoPantalla+" pulgadas";
    }
}
