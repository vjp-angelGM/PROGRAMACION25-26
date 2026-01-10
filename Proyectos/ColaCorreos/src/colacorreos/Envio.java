/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colacorreos;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author angel
 */
public class Envio {

    private static final char LETRA_INI = 'A'; //Declaramos constante 
    private static final char LETRA_FIN = 'F'; //Declaramos constante 

    private static int numEnvio = 1;//Declaramos variables globales que serán accesibles desde cualquier parte del programa
    private static int numReco = 1;//Declaramos variables globales que serán accesibles desde cualquier parte del programa

    /**
     * @param args the command line arguments
     */
    public static int getNumEnvio() {
        return numEnvio;
    }

    public static void setNumEnvio(int numEnvio) {
        numEnvio = numEnvio;
    }

    public static int getNumReco() {
        return numReco;
    }

    public static void setNumReco(int numReco) {
        numReco = numReco;
    }

    public static void IncrementarNumEnv() {// Incrementamos el numero de envios estableciendo el número de envios
        //y lo recogemos con el get y le sumamos uno al contador
        setNumEnvio(getNumEnvio() + 1);

    }

    public static void IncrementarNumReco() {// Incrementamos el numero de recogidas estableciendo el numero de recogidas
        //y lo recogemos con el get y le sumamos uno al contador
        setNumReco(getNumReco() + 1);
    }

    public static void mostrarMenu() { //Mostramos el menú de opciones
        System.out.println("--------- MENÚ OFICINA DE CORREOS ----------");
        System.out.println("1. Solicitar ticket para ENVIAR");
        System.out.println("2. Solicitar ticket para RECOGER");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
        
        System.out.println();
    }

    public static int pedirOpc(Scanner entrada) { //Recogemos la opción que introduzca el usuario y controlamos que 
        try {
            int opc = entrada.nextInt();
            return opc;
        } catch (InputMismatchException e) {
            entrada.nextLine();
            System.out.println(e);
        }return -1;
    }

    public static char generarLetra(char inicio, char fin) { //Generamos las letras para los envios 
        int ini = (int) inicio;
        int finInt = (int) fin;
        Random letra = new Random();
        int num = letra.nextInt(finInt - ini + 1) + inicio;
        return (char) num;
    }

    public static void generarNumeroEnvio() { //Generamos los números de envio
        String ticket = "E-" + getNumEnvio();
        char mesa = generarLetra(LETRA_INI, LETRA_FIN);

        System.out.println("--------------------------------");
        System.out.println("TICKET: " + ticket);
        System.out.println("Tipo: Envío");
        System.out.println("Mesa asignada: " + mesa);
        System.out.println("Por favor, espere a que su número sea llamado.");
        System.out.println("--------------------------------");

        IncrementarNumEnv(); //Llamamos al método de incrementar los numeros de envio
    }

    public static void generarNumeroRecogida() { // Generamos el número de recogida
        String ticket = "R-" + getNumReco();
        char mesa = generarLetra(LETRA_INI, LETRA_FIN);

        System.out.println("--------------------------------");
        System.out.println("TICKET: " + ticket);
        System.out.println("Tipo: Recogida");
        System.out.println("Mesa asignada: " + mesa);
        System.out.println("Por favor, espere a que su número sea llamado.");
        System.out.println("--------------------------------");

        IncrementarNumReco(); // Llamamos al método de incrementar los números de recogida
    }

}
