/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author angel
 */
public class Ejercicio4T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        Leon leon = new Leon();
        Gato gato = new Gato();
        
        System.out.println("=== Instanciación directa de subclases ===");
        lobo.mostrarCaracteristicas();
        lobo.emitirSonido();

        leon.mostrarCaracteristicas();
        leon.emitirSonido();

        gato.mostrarCaracteristicas();
        gato.emitirSonido();
    }
    
}
