/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroscreciente;
import java.util.Scanner; // importamos la libreria java.util
/**
 *
 * @author angel
 * @since 07/10/2025
 * TEMA 3 PROGRAMACIÓN
 * NUMEROS EN ORDEN CRECIENTE
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
        
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        if (n3 > n4) { aux = n3; n3 = n4; n4 = aux; }
        
        
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        if (n3 > n4) { aux = n3; n3 = n4; n4 = aux; }
        
        System.out.println("Números en orden creciente: " 
                + n1 + " - " + n2 + " - " + n3 + " - " + n4);
    }
    
}
