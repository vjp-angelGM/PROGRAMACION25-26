/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descomponerdinero;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 * DESCOMPONER DINERO
 * TEMA 2 PROGRAMACIÓN
 */
public class DescomponerDinero {

    /**
     * @param args the command line arguments
     */
    final static int BILLETE50 = 50;
    final static int BILLETE20 = 20;
    final static int BILLETE10 = 10;
    final static int BILLETE5 = 5;
    
    public static void main(String[] args) {
        int billetes50, billetes20, billetes10, billetes5,cantidad,moneda2, moneda1;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce una cantidad de dinero: ");
        cantidad = entrada.nextInt();
        
       billetes50 =  cantidad %= BILLETE50;
       billetes20 = cantidad %= BILLETE20;
       billetes10 = cantidad %= BILLETE10;
       billetes5 = cantidad %= BILLETE5;
        moneda2 = cantidad / 2;
        moneda1 = cantidad;
        
        System.out.println();
        System.out.println(cantidad+ " se descompone en: "+billetes50+" billetes de 50,"
                +billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+billetes5+" billetes de 5, "+
                moneda2 +"monedas de 2 y "+moneda1+" monedas de 1");
        
    }
    
}
