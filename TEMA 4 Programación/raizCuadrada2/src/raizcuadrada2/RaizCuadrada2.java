/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raizcuadrada2;

/**
 *
 * @author angel
 */
public class RaizCuadrada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = calculoRaiz.pedirNumero();
        double raiz = calculoRaiz.calcularRaiz(numero);
        calculoRaiz.mostrarResultado(numero, raiz);

    }

}
