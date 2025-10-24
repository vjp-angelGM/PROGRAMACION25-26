/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativo;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PositivoNegativo {

    public static int pedirNum() {
        int n1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduce un número: ");
        n1 = entrada.nextInt();
        return n1;
    }

    /**
     * @param args the command line arguments       
     */
    public static void main(String[] args) {
        int n1 = PositivoNegativo.pedirNum();

        if (n1 > 0) {
            System.out.println("El numero es positivo");
        } else if (n1 < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

}
