/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temacuatro.Utilidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Utilidades {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        return entrada.nextInt();
    }
}
