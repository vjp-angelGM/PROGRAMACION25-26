/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaproducto;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class SumaProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, resultado = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        n2 = entrada.nextInt();
        
        if (n1 > 10 ){
            System.out.println("La operación realizada es "+operaciones.suma(n1, n2)+" y el resultado es: "+ resultado);
        }else {
            System.out.println("La operación realizada es "+operaciones.producto(n1, n2)+" y el resultado es "+resultado);
        }
    }
    
}
