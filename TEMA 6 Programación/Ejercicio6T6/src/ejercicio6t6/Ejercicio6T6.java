/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t6;

/**
 *
 * @author angel
 */
public class Ejercicio6T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetos directos
        Libro libro = new Libro("El Quijote", "Cervantes", "Novela");
        Persona persona = new Persona("Ángel", "García López", "Angelito");

        System.out.println("=== PRUEBAS DIRECTAS ===");
        System.out.println(libro.concatenarTodo());
        System.out.println(persona.concatenarTodo());

        libro.contarVocales();
        persona.contarVocales();


        // Polimorfismo
        System.out.println("\n=== PRUEBAS CON POLIMORFISMO ===");

        Transformar t1 = libro;
        Transformar t2 = persona;

        System.out.println(t1.obtenerIniciales());
        System.out.println(t2.obtenerIniciales());

        System.out.println(t1.obtenerCadenaMasLarga());
        System.out.println(t2.obtenerCadenaMasLarga());

        System.out.println(t1.buscarCadena("Cervantes"));
        System.out.println(t2.buscarCadena("Ángel"));
    }
}

