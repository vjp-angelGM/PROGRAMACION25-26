/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pajarito;

/**
 *
 * @author angel
 */
public class Pajaritos {
    static int numPajaritos;

    static void estableceContadorPajaritos(int num) {
        numPajaritos = num;
    }

    static String muestraPajaros() {
        String msj = "Numero de objetos creados de la clase: ";
        return msj + " " + numPajaritos;
    }
}
