/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeromenor2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PedirNum {

    public static int pedirNum() {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero");
        return entrada.nextInt();
    }
}
