/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiempo2;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 29/09/2025
 * TEMA 2 PROGRAMACIÓN
 * TIEMPO 2 (Ejercicio 21)
 */
public class Tiempo2 {

    /**
     * @param args the command line arguments
     */
    final static int SEGUNDOSH = 3600;
    final static int SEGUNDOSM = 60;
    final static int SEGUNDOSD = 86400;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero de segundos: ");
        int tiempo = entrada.nextInt();
        
        //Calculo de tiempo
        int dias = tiempo / SEGUNDOSD;
        int horas = ( tiempo % SEGUNDOSD) / SEGUNDOSH;
        int minutos = ( tiempo % SEGUNDOSH) / SEGUNDOSM;
        int segundos = tiempo % SEGUNDOSM;
        
        System.out.println(tiempo+" segundos hacen un total de: "+dias+" dias, "+horas+" horas, "+minutos+
                " minutos y "+segundos+" segundos");
        
    }
    
}
