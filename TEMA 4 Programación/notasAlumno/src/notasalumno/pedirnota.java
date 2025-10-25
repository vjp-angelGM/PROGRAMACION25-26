/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumno;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class pedirnota {

    public static int pedirNota(int nota) {
        Scanner entrada = new Scanner(System.in); // Declaramos el Scanner
        System.out.println("Introduce una nota: "); // Pedimos al usuario una nota
        nota = entrada.nextInt(); // Recogemos la nota 

        switch (nota) {
            case 0: {
                System.out.println("Suspenso");
                break;
            }
            case 1: {
                System.out.println("Suspenso");
                break;
            }
            case 2: {
                System.out.println("Suspenso");
                break;
            }
            case 3: {
                System.out.println("Suspenso");
                break;
            }
            case 4: { // Si la nota es 4 es suspenso
                System.out.println("Suspenso");
                break;
            }
            case 5: {
                System.out.println("Bien");
                break;
            }
            case 6: { // Si es 5 o 6 es Bien
                System.out.println("Bien");
                break;
            }
            case 7: {
                System.out.println("Notable");
                break;
            }
            case 8: { // Si es 7 u 8 es Notable 
                System.out.println("Notable");
                break;
            }
            case 9: {
                System.out.println("Sobresaliente");
                break;
            }
            case 10: { // Si es 9 o 10 es sobresaliente 
                System.out.println("Sobresaliente");
                break;
            }
            default: { // Si es otra opcion que no sea una de las definidas arriba le mostramos el mensaje de error
                System.out.println("Opción introducida no válida");
                break;
            }
        }
        return nota;
    }
}
