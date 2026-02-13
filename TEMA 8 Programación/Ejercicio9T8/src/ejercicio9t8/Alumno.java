/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] notas;
    private final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }                
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }


    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }


    // MÉTODOS
    public int pedirNota(String nombre1) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota de "+nombre1+": ");
        return entrada.nextInt();
    }
    
    public void rellenarNotas() {
        System.out.println("Introduce las notas de: "+this.nombre);
        for(int i = 0; i < notas.length; i++) {
            notas[i].setNota(pedirNota(notas[i].getNombre()));
        }
    }
    
    public void mostrarNotas() {
        for(Asignatura a : notas) {
            System.out.println(a);
        }
    }
    
    public float calcularMedia() {
        float media = 0;
        
        for(Asignatura asignatura : notas) {
            media += asignatura.getNota();
        }
        
        return media / notas.length;
    }


    // TO STRING
    @Override
    public String toString() {
        return nombre + "\n · " + Arrays.toString(notas);
    }
}