/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasemana;
import java.util.Scanner; // Importamos la libreria Scanner
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
        int dia; // Declaramos el dia
        boolean laborable; // Declaramos como boleano si es laborable o no
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Introduce un dia de la semana: "); // Pedimos al usuario que introduzca un día de la semana
        dia = entrada.nextInt(); // Recogemos el dia y si es del 1 - 5 mostrará laborable
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
                laborable = false; // Si no es laborable mostrará no laborable 
                break;
            default : {
                System.out.println("El dia introducido no es válido.");
                break;
            }
        }
    }
    
}
