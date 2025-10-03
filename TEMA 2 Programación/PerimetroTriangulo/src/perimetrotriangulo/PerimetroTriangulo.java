/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetrotriangulo;
import java.util.Scanner;

/**
 *
 * @author angel
 * @since 30/09/2025
 * EJERCICIO 22 
 * TEMA 2 PROGRAMACION
 */
public class PerimetroTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1, altura;
        int area, perimetro;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un lado: ");
        lado1 = entrada.nextInt();
        
        System.out.println("Introduce la altura: ");
        altura = entrada.nextInt();
        
        area = (lado1 * altura) /2;
        perimetro = lado1 * 3;
        
        System.out.println("El area de un triangulo equilatero es: "+area);
        System.out.println("El perimetro de un triangulo equilatero es: "+perimetro);
    }
    
}
