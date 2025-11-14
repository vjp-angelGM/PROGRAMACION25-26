/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pajarito;

/**
 *
 * @author angel
 */
public class Pajarito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pajaritos.estableceContadorPajaritos(20);
        String resultado = Pajaritos.muestraPajaros();
        System.out.println(resultado);

    }
    
}
