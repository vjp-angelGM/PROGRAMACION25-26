/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temacuatro;
// import temacuatro.Utilidades;
import temacuatro.Calculadora;
/**
 *
 * @author angel
 */
public class TemaCuatro {
// Metodo que imprime un saludo -> Tipo void  

    public static void saludo() {
        System.out.println("Hola mundo");
    }

    //Metodo que imprime un mensaje con un dato que recibe por pantalla 
    public static void saludoConParametro(int num) {
        System.out.println("Hola mundo " + num);
    }

    //Método que muestra la suma de dos numeros que recibe por parametro (void)
    public static void suma(int n1, int n2) {
        System.out.println("La suma de " + n1 + " y " + n2 + " = " + (n1 + n2));
    }
//    Método que devuelve la suma por parametro (int)

    public static int sumaQueDevuelveResultado(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }
// Llamamos a un método estatico de una clase de otro paquete y hay que importarlo tanto la clase como el paquete
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 144;
        int n2 = 49;
        int resultado;
        //Llamamos al metodo
        saludo();
        saludoConParametro(4);
        suma(n1, n2);
        resultado = sumaQueDevuelveResultado(n1, n2);
        System.out.println(resultado);
        
        System.out.println("Suma: "+Calculadora.suma(n1, n2));
        System.out.println("Resta: "+Calculadora.resta(n1, n2));
        System.out.println("Multiplicación: "+Calculadora.multiplicacion(n1, n2));
        System.out.println("División: "+Calculadora.division(n1, n2));
        System.out.println("Raíz cuadrada: "+Calculadora.raiz(n1));
        System.out.println("Raíz cuadrada: "+Calculadora.raiz(n2));
    }

}
