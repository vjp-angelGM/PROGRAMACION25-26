/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t5;

/**
 *
 * @author angel
 */
public class Curso {
    private static int numeroDeCursos = 0;
    
    private String nombre;
    private int numeroHoras;
    
    public void establecerNombreYHoras(String nombre, int horas){
        this.nombre = nombre;
        this.numeroHoras = horas;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public int obtenerHoras(){
        return this.numeroHoras;
    }
    
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static void verNumeroCursos(){
        System.out.println("\nCursos: "+numeroDeCursos);
    }
    
}


