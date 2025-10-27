/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromenor2;

/**
 *
 * @author angel
 */
public class NumeroMenor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = PedirNum.pedirNum();
        int num2 = PedirNum.pedirNum();
        int num3 = PedirNum.pedirNum();
        compararNum.mostrarMenor(num1, num2, num3);
    }
    
}
