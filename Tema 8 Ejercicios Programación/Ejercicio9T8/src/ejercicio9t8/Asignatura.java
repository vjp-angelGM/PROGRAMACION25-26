/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t8;

/**
 *
 * @author angel
 */
public class Asignatura {
    // ATRIBUTOS
    private String nombre;
    private float nota;

    // CONSTRUCTORES
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return nombre + ": " + nota;
    }


}