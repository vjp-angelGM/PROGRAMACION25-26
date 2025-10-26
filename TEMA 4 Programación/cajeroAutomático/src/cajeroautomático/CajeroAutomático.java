/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomático;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class CajeroAutomático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce una cantidad de dinero: ");
        int dinero = entrada.nextInt();
        
        descomponerDinero.descomponer(dinero);
    }
    
}
