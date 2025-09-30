/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusatriangulo;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class HipotenusaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double cateto1, cateto2, hipotenusa;
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Introduce el primer cateto: ");
       cateto1 = entrada.nextDouble();
       
        System.out.println("Introduce el segundo cateto: ");
        cateto2 = entrada.nextDouble();
        
        hipotenusa = Math.sqrt((cateto1 * cateto1)+(cateto2 * cateto2));
        hipotenusa = (int) (hipotenusa * 100) / 100.0;
        
        System.out.println("La hipotenusa del triangulo es: "+hipotenusa);
    }
    
}
