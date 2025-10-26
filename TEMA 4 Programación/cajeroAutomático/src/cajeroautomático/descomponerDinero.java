/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomático;

/**
 *
 * @author angel
 */
public class descomponerDinero {
    public static void descomponer(int dinero){
        int billete50 = dinero / 50; 
        dinero = dinero % 50;
        
        int billete20 = dinero / 20;
        dinero %= 20;

        int billete10 = dinero / 10;
        dinero %= 10;

        int billete5 = dinero / 5;
        dinero %= 5;

        int moneda2 = dinero / 2;
        dinero %= 2;

        int moneda1 = dinero;

        System.out.println("Euros descompuestos:");
        if (billete50 > 0) System.out.println("Billetes de 50: " + billete50);
        if (billete20 > 0) System.out.println("Billetes de 20: " + billete20);
        if (billete10 > 0) System.out.println("Billetes de 10: " + billete10);
        if (billete5 > 0) System.out.println("Billetes de 5: " + billete5);
        if (moneda2 > 0) System.out.println("Monedas de 2 euros: " + moneda2);
        if (moneda1 > 0) System.out.println("Monedas de 1 euro: " + moneda1);
    }
}
