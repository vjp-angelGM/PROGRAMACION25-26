/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroscreciente;

/**
 *
 * @author angel
 */
public class burbuja {

    public static void ordenarBurbuja(int n1, int n2, int n3, int n4) {
        int aux;

        // Primera pasada
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n3 > n4) {
            aux = n3;
            n3 = n4;
            n4 = aux;
        }

        // Segunda pasada
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        // Tercera pasada
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        System.out.println("Números en orden creciente: " + n1 + " - " + n2 + " - " + n3 + " - " + n4);
    }
}
