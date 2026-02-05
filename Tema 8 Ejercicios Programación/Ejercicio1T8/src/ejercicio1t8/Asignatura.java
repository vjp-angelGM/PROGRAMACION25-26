/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t8;

/**
 *
 * @author angel
 */
public class Asignatura {
    private String nombre;
    private double nota;
    
    public Asignatura(){
       this.nombre = "";
       this.nota = 0;
    }
    
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   public double getNota() {
        return nota;
    }
   
   public void setNota(double nota) {
        this.nota = nota;
    }
   
   @Override
    public String toString() {
        return nombre + ": " + nota;
    }
}
