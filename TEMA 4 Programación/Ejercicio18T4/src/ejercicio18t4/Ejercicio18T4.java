/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18t4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio18T4 {
    
    public static String pedirNombre(){
        Scanner teclado = new Scanner(System.in);
        String nom;
        System.out.print("Introduzca un nombre: ");
        nom = teclado.nextLine();
        return nom;
    }
    
    public static void mostrarNombre(String nom){
        int i;
        for(i=0;i<5;i++){
            System.out.println(nom);
        }
    }
    
    public static void posicionDiaSemana(String dia){
        if  (dia.equals("Lunes")){
            System.out.println(dia+" es el primer día de la semana");
        }
        else{
            if  (dia.equals("Martes")){
                System.out.println(dia+" es el segundo día de la semana");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = pedirNombre();
        mostrarNombre(nombre);
        System.out.print("Día semana ");
        String dia = teclado.nextLine();
        posicionDiaSemana(dia);
    }
    
}
