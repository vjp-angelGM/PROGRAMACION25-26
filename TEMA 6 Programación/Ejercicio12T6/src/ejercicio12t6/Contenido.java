/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12t6;

/**
 *
 * @author angel
 */
public abstract class Contenido {
    private String Titulo;
    private boolean Entregado;
    private String Genero;
    
    public Contenido(){
        this.Titulo = "";
        this.Entregado = false;
        this.Genero = "";
    }
    
    public Contenido(String Titulo, boolean Entregado, String Genero){
        this.Titulo = Titulo;
        this.Entregado = Entregado;
        this.Genero = Genero;
    }
    
    public String getTitulo(){
        return Titulo;
    }
    
    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    
    public String getGenero(){
        return Genero;
    }
    
    public void setGenero(String Genero){
        this.Genero = Genero;
    }
    
    public boolean getEntregado(){
        return Entregado;
    }
    
    public void setEntregado(boolean Entregado){
        this.Entregado = Entregado;
    }
    
    public abstract double valorar();
    
    @Override
    
    public String toString(){
        return "Titulo: "+Titulo+" , Genero: "+Genero+", Entregado: "+Entregado;
    }
}
