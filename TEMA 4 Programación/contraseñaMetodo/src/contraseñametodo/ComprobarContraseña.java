/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñametodo;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ComprobarContraseña {

    final static int CONTRASEÑA = 1234;

    public static int pedirContrasena() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        return entrada.nextInt();
    }

    public static boolean comprobarContrasena(int clave) {
        return clave == CONTRASEÑA;
    }

    public static void mostrarResultado(boolean accesoConcedido, int intentosRestantes) {
        if (accesoConcedido) {
            System.out.println("\nLa contraseña es correcta. Enhorabuena, puedes acceder al sistema.");
        } else {
            System.out.println("\nContraseña incorrecta");
            System.out.println("--> Intentos restantes: " + intentosRestantes);
        }
    }
}
