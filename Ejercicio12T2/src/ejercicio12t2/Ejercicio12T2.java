/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12t2;

/**
 *
 * @author angel
 */
public class Ejercicio12T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 7 >> 1 ;
        System.out.println(num);
    }
    
}
