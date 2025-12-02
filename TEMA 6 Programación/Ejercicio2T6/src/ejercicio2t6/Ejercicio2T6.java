/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author angel
 */
public class Ejercicio2T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Ángel","DAW"){};
        alumno.saludar();
        Profesor profe = new Profesor("David Mera","Informática y Comunicaciones"){};
        profe.saludar();
        
        Persona profesor1 = new Profesor ("David","Informatica y Comunicaciones");
        profesor1.saludar();
        
        Persona alumno1 = new Alumno ("Ángel","DAW");
        alumno1.saludar();
        
        
    }
    
}
