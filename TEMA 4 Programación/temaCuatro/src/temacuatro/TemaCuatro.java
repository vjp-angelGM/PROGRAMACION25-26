/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temacuatro;

/**
 *
 * @author angel
 */
public class TemaCuatro {
// Metodo que imprime un saludo -> Tipo void  
    public static void saludo(){
        System.out.println("Hola mundo");
    }
    
    //Metodo que imprime un mensaje con un dato que recibe por pantalla 
    public static void saludoConParametro(int num){
        System.out.println("Hola mundo "+num);
    }
    
     //Método que muestra la suma de dos numeros que recibe por parametro
    public static void suma (int n1, int n2){
        System.out.println("La suma de "+n1+" y "+n2+" = "+(n1 + n2));
    }
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        //Llamamos al metodo
        saludo();
        saludoConParametro(4);
        suma(n1, n2);
    }
    
}
