/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasemana;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 07/10/2025
 * TEMA 3 PROGRAMACIÓN
 * DIA DE LA SEMANA
 */
public class DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        boolean laborable;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un dia de la semana: ");
        dia = entrada.nextInt();
        switch (dia){
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7: 
                laborable = false;
                break;
            default : {
                System.out.println("El dia introducido no es válido.");
                break;
            }
        }
    }
    
}
