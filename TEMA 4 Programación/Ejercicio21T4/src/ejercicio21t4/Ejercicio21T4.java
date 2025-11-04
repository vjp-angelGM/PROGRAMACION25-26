/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21t4;

/**
 *
 * @author angel
 */
public class Ejercicio21T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Operaciones.pedirPrimerNum();
        num2 = Operaciones.pedirSegundoNum(num1);
        Operaciones.mostrarSumaPares(num1, num2);
    }
    
}
