/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesmatematicas;

/**
 *
 * @author angel
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultadoRaiz = Operaciones.raizCuadrada(64);
        double resultadoCubo = Operaciones.potencia(8);
        double resultadoExp = Operaciones.exponencial(2);
        double resultadoLog = Operaciones.logaritmo(2.71828);
        double resultadoMin = Operaciones.menorValor(2, 3);
        double resultadoABS = Operaciones.valorAbsoluto(-4.5);
        double resultadoSeno = Operaciones.seno(45);

        System.out.println("Raiz cuadrada de 64: " + resultadoRaiz);
        System.out.println("8 al cubo es: " + resultadoCubo);
        System.out.println("Exponencial de 2: " + resultadoExp);
        System.out.println("Logaritmo de 2.71828: " + resultadoLog);
        System.out.println("Menor valor entre 2 y 3: " + resultadoMin);
        System.out.println("El seno de 45 grados es: " + resultadoSeno);
    }

}
