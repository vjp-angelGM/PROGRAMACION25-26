/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t7;

/**
 *
 * @author angel
 */
public class Ejercicio6t7 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean esPrimo(int num){
        if (num < 2) {
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }
        
        for (int i = 3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int [] llenarArrayPrimos(){
        int [] primos = new int [80];
        int contador = 0;
        int num = 2;
        
        while (contador < 80){
            if (esPrimo(num)){
                primos[contador] = num;
                contador++;
            }
            num++;
        }
        return primos;
    }
    public static void verArray(int [] array){
        System.out.println("Array de numeros primos");
        System.out.println("");
        for (int i = 0; i < array.length; i++){
            System.out.println(" [ "+i+" ] -> "+array[i] );
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        int [] numerosprimos = llenarArrayPrimos();
        verArray(numerosprimos);
    }
    
}
