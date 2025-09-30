/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notamedia;
import java.util.Scanner;
/**
 *
 * @author angel
 * @since 30/09/2025
 * NOTAS MEDIAS ASIGNATURAS
 * TEMA 2 PROGRAMACIÓN
 */
public class NotaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables que van a almacenar las notas
        double programacion,fol,entornos,basesDatos,sistemas,lenguajes;
        double notamedia;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca la nota de Programación: ");
        programacion = entrada.nextDouble();

        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        lenguajes = entrada.nextDouble();

        System.out.print("Introduzca la nota de Bases de Datos: ");
        basesDatos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        sistemas = entrada.nextDouble();

        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        fol = entrada.nextDouble();
        
        notamedia = (fol + entornos + sistemas + basesDatos + lenguajes + programacion) / 6;
        
        System.out.println("La nota media del curso es: "+notamedia);
        
    }
    
}
