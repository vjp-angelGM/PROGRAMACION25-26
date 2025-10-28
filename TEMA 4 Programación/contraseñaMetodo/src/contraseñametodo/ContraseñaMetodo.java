/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseñametodo;

/**
 *
 * @author angel
 */
public class ContraseñaMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int errores = 0;
        boolean acceso = false;
        do {
            int clave = ComprobarContraseña.pedirContrasena();
            acceso = ComprobarContraseña.comprobarContrasena(clave);

            ComprobarContraseña.mostrarResultado(acceso, 3 - errores);

            if (!acceso) {
                errores++;
            }
        } while (!acceso && errores < 3);

        if (!acceso) {
            System.out.println("\nLo siento, has alcanzado el límite de intentos de acceso al sistema.");
        }
    }
}
