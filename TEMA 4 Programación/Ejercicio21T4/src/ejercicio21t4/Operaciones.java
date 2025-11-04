/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21t4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Operaciones {

    public static int pedirPrimerNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        return entrada.nextInt();
    }

    public static int pedirSegundoNum(int num1) {
        int num2;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce el segundo número (mayor que " + num1+")");
            num2 = entrada.nextInt();
            if (num2 <= num1) {
                System.out.println("El numero debe ser mayor. Inténtalo de nuevo");
            }
        } while (num2 <= num1);
        return num2;
    }
    public static void mostrarSumaPares (int num1, int num2){
        int suma = 0;
        for (int i = num1 + 1; i < num2; i++){
            if (i % 2 == 0){
                suma+=i;
            }
        }
        System.out.println("La suma de los numeros pares comprendidos entre "+num1+" y "+num2+" es: "+suma);
    }
}
