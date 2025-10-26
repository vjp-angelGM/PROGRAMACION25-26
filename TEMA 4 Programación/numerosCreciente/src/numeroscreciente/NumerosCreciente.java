/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroscreciente;
import java.util.Scanner;
import numeroscreciente.burbuja;

/**
 *
 * @author angel
 */
public class NumerosCreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,n4,aux; // Declaramos las variables de los 4 numeros y la auxiliar para poder intercambiarlos
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce 4 numeros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();
        
        burbuja.ordenarBurbuja(n1, n2, n3, n4);
        
    }
    
}
