/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerousuario;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class NumeroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero:  ");
            num = entrada.nextInt();

            if (num < 1) {
                System.out.println("El numero introducido no puede ser menor de 1");
            }

        } while (num < 1);
        System.out.println("Los numeros que hay entre 1 y " + num + " son: ");
        for (int i = 2; i < num; i++) {
            System.out.println(i);
        }
    }

}
