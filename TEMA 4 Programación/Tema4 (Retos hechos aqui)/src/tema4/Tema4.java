/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.InputMismatchException;
import tema4.Utilidades.utilidades;

/**
 *
 * @author angel
 */
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    public class MetodosEstaticos {
        // Método que imprime un saludo -> tipo void

        public static void saludo() {
            System.out.println("Hola mundo con Java");
        }

        // Método que imprime un mensaje con un dato que recibe por parámetro -> tipo void
        public static void saludoConParametro(int num) {
            saludo();
            System.out.println("Hola mundo" + num);
        }

        // Método que muestra la suma de dos números que recibe por parámetro -> tipo void
        public static void suma(int num1, int num2) {
            System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
        }

        // Método que devuelve la suma de dos números que recibe por parámetro -> tipo int
        public static int sumaQueDevuelveElResultado(int num1, int num2, boolean enc) {
            int resultado = num1 + num2;
            return resultado;
        }

        // Método que devuelve true si la contraseña 
        // que pasamos por parámetro es correcta -> tipo boolean               
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            int num1;
            int num2;
            double resultado;

            // Llamamos a los métodos para que se ejecuten al lanzar el programa.
//        saludo();
//        saludoConParametro(num1);
//        suma(num1, num2);
//        resultado = sumaQueDevuelveElResultado(num1, num2);
//        System.out.println(resultado);
//        System.out.println(sumaQueDevuelveElResultado(num1, num2));
            // Llamamos a métodos estático de otra clase
//        System.out.println(Calculadora.suma(num1, num2));
//        System.out.println(Calculadora.resta(num1, num2));
            // Llamamos a un método estático de una clase de otro paquete
            // (debemos importar el paquete)
//        Utilidades.pedirNumero();
            // Creamos una calculadora
            // 1. Pedimos 2 números
//        num1 = Utilidades.pedirNumero();
//        num2 = Utilidades.pedirNumero();               
//        
//        // 2. Llamamos a los métodos
//        // guardamos el resultado en una variable
//        // y mostramos dicha variable
//        try {
//            resultado = Calculadora.suma(num1, num2);
//            System.out.println(num1 + " + " + num2 + " = " + resultado);
//
//            resultado = Calculadora.resta(num1, num2);
//            System.out.println(num1 + " - " + num2 + " = " + resultado);
//
//            resultado = Calculadora.multiplicacion(num1, num2);
//            System.out.println(num1 + " * " + num2 + " = " + resultado);
//
//            resultado = Calculadora.division(num1, num2);
//            System.out.println(num1 + " / " + num2 + " = " + resultado);
//
//            resultado = Calculadora.raizCuadrada(num1);
//            System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
//            
//            resultado = Calculadora.redondeoBajo(2.4930);
//            System.out.println("2.4930 redondeado a la baja es " + resultado);
//            
//            System.out.println("El cubo de " + num1 + " es: " + Calculadora.cubo(num1));
//            
//            System.out.println("El logaritmo de " + num1 +  " es: " + Calculadora.logaritmo(num1));
//            
//            System.out.println("El número mayor de " + num1 + " y " + num2 + " es: " + Calculadora.valorMaximo(num1, num2));            
//            
//            
//        } catch(ArithmeticException e) {
//            System.out.println("Ha sucedido una excepción aritmética");
//        }
//        System.out.println("Letra aleatoria: " + Utilidades.generarLetraAleatoria('a', 'z'));
        }

    }
}
