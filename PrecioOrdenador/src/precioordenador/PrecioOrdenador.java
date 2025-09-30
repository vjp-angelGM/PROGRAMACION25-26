/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precioordenador;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 */
public class PrecioOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el precio del ordenador que te quieres llevar:  ");
        double precio = entrada.nextFloat();
        
        System.out.println("¿Cuantas quieres llevarte?");
        int unidades = entrada.nextInt();
        
        double total = precio * unidades;
        
        System.out.println("El precio total de las compras es: "+total);
    }
    
}
