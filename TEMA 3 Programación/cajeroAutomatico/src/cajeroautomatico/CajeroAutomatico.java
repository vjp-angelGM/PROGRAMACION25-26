/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    final static int BILLETE50 = 50;//Declaro la constante con el valor del billete
    final static int BILLETE20 = 20;//Declaro la constante con el valor del billete
    final static int BILLETE10 = 10;//Declaro la constante con el valor del billete
    final static int BILLETE5 = 5;//Declaro la constante con el valor del billete
    public static void main(String[] args) {
        int billetes50, billetes20, billetes10, billetes5,cantidad,moneda2, moneda1,resto;// Declaro las variables con las que voy a operar 
        
        Scanner entrada = new Scanner (System.in); // Declaramos el Scanner para poder recoger el valor que introduzca el usuario
        
        System.out.println("Introduce una cantidad de dinero: "); // Le pedimos al usuario que introduzca una cantidad de dinero
        cantidad = entrada.nextInt(); // Recogemos ese valor 
        
        billetes50 = cantidad / 50; // Divido la cantidad de dinero entre el valor de la constante
        resto = cantidad%50;// Operamos con el resto de esa cantidad 
        
        billetes20 = cantidad / 20;// Divido la cantidad de dinero entre el valor de la constante
        resto = cantidad % 20;// Operamos con el resto de esa cantidad 
        
        billetes10 = cantidad / 10;// Divido la cantidad de dinero entre el valor de la constante
        resto = cantidad % 10;// Operamos con el resto de esa cantidad 
        
        billetes5 = cantidad / 5;// Divido la cantidad de dinero entre el valor de la constante
        resto = cantidad % 5;// Operamos con el resto de esa cantidad 
        
        moneda2 = cantidad / 2;// Divido la cantidad de dinero entre el valor de la constante
        moneda1 = cantidad % 2;// Aqui las monedas de 1€ son el resto de las monedas de 2
        
        System.out.println();
        System.out.println(cantidad+"se descompone en: "); // Mostramos por pantalla el resultado 
        if (billetes50 > 0) System.out.println(" - " + billetes50 + " billete(s) de 50€");
        if (billetes20 > 0) System.out.println(" - " + billetes20 + " billete(s) de 20€");
        if (billetes10 > 0) System.out.println(" - " + billetes10 + " billete(s) de 10€");
        if (billetes5 > 0)  System.out.println(" - " + billetes5 + " billete(s) de 5€");
        if (moneda2 > 0)    System.out.println(" - " + moneda2 + " moneda(s) de 2€");
        if (moneda1 > 0)    System.out.println(" - " + moneda1 + " moneda(s) de 1€");
    }
    
}
