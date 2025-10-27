/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeromenor2;

/**
 *
 * @author angel
 */
public class compararNum {
    public static void mostrarMenor(int num1, int num2, int num3){
        int menor;
        if (num1 <= num2 && num1 <= num3){
            menor = num1;
        }else if (num2 <= num1 && num2 <= num3){
            menor = num2;
        }else {
            menor = num3;
        }
        System.out.println("El menor de los 3 números es: "+menor);
    }
}
