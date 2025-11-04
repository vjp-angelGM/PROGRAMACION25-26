/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesmatematicas;

/**
 *
 * @author angel
 */
public class Operaciones {

    public static double raizCuadrada(int num) {
        return Math.sqrt(num);
    }

    public static double potencia(double num) {
        return Math.pow(num, 3);
    }

    public static double exponencial(double num) {
        return Math.exp(num);
    }

    public static double logaritmo(double num) {
        return Math.log(num);
    }
    public static double menorValor(double num1, double num2){
        return Math.min(num1, num2);
    }
    public static double valorAbsoluto(double num){
        return Math.abs(num);
    }
    public static long redondear (double num){
        return Math.round(num);
    }
    public static double seno (double num){
        return Math.sin(num);
    }
    
}
