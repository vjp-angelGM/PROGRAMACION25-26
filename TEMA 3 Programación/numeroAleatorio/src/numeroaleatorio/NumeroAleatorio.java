/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intento = 0, numsec = (int) (Math.random() * 100) + 1, num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("He pensado un numero entre 1 y 100. ¡Adivinalo!'");

        /* while (num != numsec){
            System.out.println("Introduce un numero por favor");
            num = sc.nextInt();
            intento++;
            
            if (num < numsec){
                System.out.println("El numero es mayor");
            }else if (num > numsec) {
                System.out.println("El numero es menor");
            }else {
                System.out.println("¡Correcto!. Has adivinado el número en "+intento);
            }
        }
    }*/
        do {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            intento++;
            if (num < numsec) {
                System.out.println("El numero es mayor");
            } else if (num > numsec) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("¡Correcto!. Has adivinado el número en " + intento+" intentos.");
            }
        } while (num != numsec);
    }
}
