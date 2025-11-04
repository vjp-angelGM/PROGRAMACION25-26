/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17t4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio17T4 {

    //Genera un número aleatorio (que se corresponde con una letra - a 97, z 122-)
    public static int generarAleatorio(){
        int aleatorio;
        double aleatorioDouble;
        aleatorioDouble = (Math.random()) * 26 + 97;
        aleatorioDouble = Math.floor(aleatorioDouble);
        aleatorio = (int)aleatorioDouble;
        return aleatorio;
    }
    
    //Pedimos al usuario una letra y devolvemos su entero equivalente
    public static int pedirLetra(){
        Scanner teclado = new Scanner(System.in);
        int numLetra;
        char letra;
        System.out.print("\nLetra: ");
        letra = teclado.nextLine().charAt(0);
        numLetra = (int)letra;
        return numLetra;
    }
    
    //Comprueba si la letra es la correcta o no
    public static boolean comprobar(int letraUsuario, int letraSecreta){
        boolean acierto = false;
        if (letraUsuario > letraSecreta){
            System.out.print("La letra secreta está antes en el alfabeto");
        }
        else{
            if (letraUsuario < letraSecreta){
                System.out.print("La letra secreta está despues en el alfabeto");
            }    
            else{
                System.out.print("¡Enhorabuena!");
                acierto = true;
            }
        }
        return acierto;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLetra, numSecreto, intentos = 0;
        boolean acierto;
        char letraUsu, letraSecreta;
        
        numSecreto = generarAleatorio();
        //Convierto el entero en su correspondiente letra para mostrarla posteriormente
        letraSecreta = (char)numSecreto;
        
        System.out.println("Adivina la letra secreta entre a y z");
        do{
            numLetra = pedirLetra();
            acierto = comprobar(numLetra, numSecreto);
            intentos++;
        }while(!acierto);
        System.out.println("La letra secreta era la "+letraSecreta);
        System.out.println("Has necesitado "+intentos+" intentos");
    }
    
}
