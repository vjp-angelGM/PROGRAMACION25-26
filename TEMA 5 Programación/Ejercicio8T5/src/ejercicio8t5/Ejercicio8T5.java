/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8t5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio8T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test test = new Test();
        Test.Numero numero = test.new Numero(0);

        int num = Test.Numero.PedirNum();
        Test.Numero.Par(num);
    }
}
