/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseñausuario;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ContraseñaUsuario {

    final static int CONTRASEÑA = 1234;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int errores = 0;
        int clave;
        do {
            System.out.println("Introduce la contraseña: ");
            clave = entrada.nextInt();

            if (clave == CONTRASEÑA) {
                System.out.println("\n La contraseña es correcta. Enhorabuena, puedes acceder al sistema");
            } else {
                errores++;
                System.out.println("\n Contraseña incorrecta");
                System.out.println("--> Intentos restantes: " + (3 - errores));
            }
        } while (clave != CONTRASEÑA && errores < 3);

        if (errores == 3 && clave != CONTRASEÑA) {
            System.out.println("\n Lo siento, has alcanzado el límite de intentos de acceso al sistema. ");
        }
    }

}
