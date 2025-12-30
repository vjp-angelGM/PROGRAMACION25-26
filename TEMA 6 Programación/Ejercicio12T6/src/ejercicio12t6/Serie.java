/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12t6;

/**
 *
 * @author angel
 */
public abstract class Serie extends Contenido implements Alquilable{
    private int numeroTemporadas;
    private String creador;
    
    public Serie(){
        super();
        this.numeroTemporadas = 3;
        this.creador = "";
    }
    
    public Serie(String Titulo, String creador){
        super ();
        this.numeroTemporadas = 3;
        this.creador = creador;
    }
    
    public Serie(String titulo, String genero, int numeroTemporadas, String creador) {
        super();
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
    }
    
    public int getNumTemporadas(){
        return numeroTemporadas;
    }
    
    public void setNumTemporadas(int numeroTemporadas){
        this.numeroTemporadas = numeroTemporadas;
    }
    
    public String getCreador(){
        return creador;
    }
    
    public void setCreador(String creador){
        this.creador = creador;
    }
}
