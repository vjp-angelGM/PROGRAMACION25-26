/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t5;

/**
 *
 * @author admin
 */
public class Asignatura {
    //Atributos
    private String nombre;
    private int nota;
    
    //Métodos
    
    //Constructos por defecto
    Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    
    //Constructos parametrizado
    Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0;
    }

    //Método getNombre. Retorna el valor del atributo Nombre
    public String getNombre(){
        return this.nombre;
    }
    
    //Método getNota. Retorna el valor del atributo Nota
    public int getNota(){
        return this.nota;
    }
    
    //Método setNombre. Establece el nombre del atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método setNota. Establece la nota del atributo
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    //Método estático para calcular la nota media de las asignaturas.
    public static float calcularMedia(int n1, int n2, int n3, int n4, int n5, int n6){
        int suma = n1 + n2 + n3 + n4 + n5 + n6;
        float notaMedia = suma / 6;
        return notaMedia;
    }
    
}
