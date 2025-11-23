/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8t5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Test {

    public class Numero {

        private int numero;

        // Constructor opcional
        public Numero(int numero) {
            this.numero = numero;
        }

        // Getter
        public int getNumero() {
            return numero;
        }

        // Setter
        public void setNumero(int numero) {
            this.numero = numero;
        }

        public static int PedirNum() {
            int num;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();
            return num;
        }

        public static void Par(int numero) {
            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }

    }
}
