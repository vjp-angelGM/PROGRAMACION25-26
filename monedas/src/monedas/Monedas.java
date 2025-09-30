/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedas;

/**
 *
 * @author agarciam01
 */
public class Monedas {

    /**
     * @param args the command line arguments
     */
    
    //Constante con el dinero total que tenemos que calcular
    final static int DINERO = 180;
    
    //Constante con los billetes en los que los queremos dividir
    final static int BILLETE10 = 10;
    final static int BILLETE50 = 50;
    
    public static void main(String[] args) {
       int billetes50;
       int billetes10;
       int resto;
       
       billetes50 = DINERO / BILLETE50; //Calculamos el monto en billetes de 50€
       resto = DINERO % BILLETE50; // Calculamos el monto que sobra despues de quitar los billetes de 50
       billetes10 = resto / BILLETE10; // Calculamos el resto en billetes de 10
       
       
       //Mostramos el resultado
       System.out.println(DINERO + " euros hacen una cantidad de "+billetes50+" billetes de 50 y "+billetes10+" billetes de 10");
    }
    
}
