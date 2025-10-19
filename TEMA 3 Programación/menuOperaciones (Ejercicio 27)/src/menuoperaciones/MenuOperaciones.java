/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuoperaciones;

import java.util.Scanner; //Importamos la libreria java.util
import java.util.InputMismatchException; // Importamos la libreria MismatchException

/**
 *
 * @author angel
 */
public class MenuOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma, resta, producto, division, opc; // Declaramos las variables

        Scanner entrada = new Scanner(System.in); //Hago el Scanner 

        System.out.println("--------------  Menú de operaciones ------------------"); // Mostramos el menú de opciones
        System.out.println("Selecciona una opción del menú: ");
        System.out.println("1.  SUMA");
        System.out.println("2.  RESTA");
        System.out.println("3.  MULTIPLICACIÓN");
        System.out.println("4.  DIVISIÓN");
        System.out.println("5.  SALIR");
        opc = entrada.nextInt();

        System.out.println("--------------------- Entrada de datos ------------------");
        System.out.println("Introduce el primer numero: ");// Pedimos el número
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");// Pedimos el número
        num2 = entrada.nextInt();

        switch (opc) { //Planteamos cada uno de los casos que se darán al seleccionar una opción
            case 1: { //SUMA
                suma = num1 + num2;
                System.out.println("Has elegido la suma");
                System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es: " + suma);
                break;
            }
            case 2: { // RESTA
                resta = num1 - num2;
                System.out.println("Has elegido la resta");
                System.out.println("El resultado de restar " + num1 + " y " + num2 + " es: " + resta);
                break;
            }
            case 3: { //MULTIPLICACIÓN
                producto = num1 * num2;
                System.out.println("Has elegido la multiplicación");
                System.out.println("El resultado de multiplicar " + num1 + " y " + num2 + " es: " + producto);
                break;
            }
            case 4: { // DIVISIÓN
                System.out.println("Has elegido la división");
                try { //Intentamos dividir el primer numero entre el segundo
                    division = num1 / num2;
                    System.out.println("El resultado de dividir " + num1 + " y " + num2 + " es: " + division);
                } catch (ArithmeticException e) { //Controlamos el error de que el usuario quiera dividir por 0
                    System.out.println("No es posible dividir por 0"); // Mostramos el mensaje de error 
                    System.out.println(e);
                }
                break;
            }
            case 5: { // SALIR DEL PROGRAMA
                System.out.println("Has elegido salir");
                System.out.println("Gracias por utilizar nuestro programa");
                break;
            }
            default: {
                System.out.println("Opción introducida no válida");
            }
        }
    }

}
