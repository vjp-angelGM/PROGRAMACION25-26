/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t9;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio9T9 {

    /**
     * @param args the command line arguments
     */
    public static boolean validarContrasena(String usuario, String contrasena) {
        
        if (contrasena.length() < 6) {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            return false;
        }
        int contadorDigitos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("Error: La contraseña debe contener al menos 2 dígitos.");
            return false;
        }

       
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("Error: La contraseña no puede contener el nombre de usuario.");
            return false;
        }

       
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE CONTRASEÑAS ===\n");
        System.out.print("Introduce tu usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Introduce tu contraseña: ");
        String contrasena = entrada.nextLine();

        if (validarContrasena(usuario, contrasena)) {
            System.out.println("\n Contraseña válida. ¡Bienvenido!");
        } else {
            System.out.println("\n Contraseña inválida. Revisa los requisitos.");
        }
    }

}
