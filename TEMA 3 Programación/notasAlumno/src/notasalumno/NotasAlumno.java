/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumno;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 06/10/2025
 * TEMA 3 PROGRAMACION
 * NOTAS ALUMNOS 
 */
public class NotasAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una nota: ");
        nota = entrada.nextInt();
        
        switch (nota){
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
            case 4: {
                System.out.println("Suspenso");
                break;
            }
            case 5: {
                System.out.println("Bien");
                break;
            }
            case 6: {
                System.out.println("Bien");
                break;
            }
            case 7: {
                System.out.println("Notable");
                break;
            }
            case 8: {
                System.out.println("Notable");
                break;
            }
            case 9: {
                System.out.println("Sobresaliente");
                break;
            }
            case 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default: {
                System.out.println("Opción introducida no válida");
                break;
            }
        }
    }
    
}
