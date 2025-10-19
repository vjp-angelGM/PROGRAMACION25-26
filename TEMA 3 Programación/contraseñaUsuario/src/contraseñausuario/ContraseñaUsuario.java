/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseñausuario;

import java.util.Scanner; // Importamos la libreria Scanner

/**
 *
 * @author angel
 */
public class ContraseñaUsuario {

    final static int CONTRASEÑA = 1234; // Declaramos la contraseña como constante

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Declaramos el Scanner
        int errores = 0; // Declaramos los errores
        int clave; // Declaramos una variable para la clave que será la que se recoja del usuario
        do {
            System.out.println("Introduce la contraseña: "); // Pedimos al usuario que introduzca una contraseña
            clave = entrada.nextInt(); // Recogemos la contraseña

            if (clave == CONTRASEÑA) { // Comparamos lo que ha introducido el usuario con lo almacenado
                System.out.println("\n La contraseña es correcta. Enhorabuena, puedes acceder al sistema"); // Si coincide mostramos este mensaje
            } else { // Si no coincide
                errores++;  // Añadimos un error
                System.out.println("\n Contraseña incorrecta"); // Mostramos este mensaje
                System.out.println("--> Intentos restantes: " + (3 - errores)); // Mostramos el numero de intentos restantes 
            }
        } while (clave != CONTRASEÑA && errores < 3); // Repetir mientras la clave sea distinta y el numero de intentos no sea igual a 3

        if (errores == 3 && clave != CONTRASEÑA) { // Si el numero de errores es 3 y la clave es distinta a la contraseña 
            System.out.println("\n Lo siento, has alcanzado el límite de intentos de acceso al sistema. "); // Mostramos este mensaje
        }
    }

}
