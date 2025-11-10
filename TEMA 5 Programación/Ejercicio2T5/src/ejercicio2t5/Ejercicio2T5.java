/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t5;

/**
 *
 * @author angel
 */
public class Ejercicio2T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.establecerNombreYHoras("Web", 30);
        Curso.sumarCursos();
        curso2.establecerNombreYHoras("Programación", 300);
        Curso.sumarCursos();

        System.out.println("Nombre: " + curso1.obtenerNombre() + " --- Horas: " + curso1.obtenerHoras());
        System.out.println("Nombre: " + curso2.obtenerNombre() + " -- Horas: " + curso2.obtenerHoras());
        
        Curso.verNumeroCursos();

    }

}
