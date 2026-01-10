/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colacorreos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author angel
 */
public class ColaCorreos {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc; // Nos declaramos la variable opcion
// Hacemos un bucle para llamar al menú
        do {
            Envio.mostrarMenu(); // Mostramos el menú
            opc = Envio.pedirOpc(entrada); //Pedimos y recogemos la entrada del usuario con este método

            switch (opc) {
                case 1: {
                    Envio.generarNumeroEnvio();// Generaremos el número de envio
                    break;
                }
                case 2: {
                    Envio.generarNumeroRecogida(); // Generaremos el número de recogida
                    break;
                }
                case 3: { // Saldremos del programa
                    System.out.println("Saliendo....... Gracias por utilizar nuestro programa");
                    break;
                }
                default: // Hacemos el default para mostrar que nos ha introducido una opción inválida
                    System.out.println("Opción introducida no válida.");
            }
            
        }while (opc != 3);
    }

}
