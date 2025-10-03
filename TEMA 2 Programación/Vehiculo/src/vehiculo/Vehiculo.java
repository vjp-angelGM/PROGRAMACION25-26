/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author angel
 * @since 20/09/2025
 * Vehículo 
 * TEMA 2 PROGRAMACIÓN
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     * 
     */
    int ruedas;
    private int velocidad;
    String nombre;
    
    public void  Arrancar(){//Este método es void porque no devuelve ningún valor
        velocidad = 0; //Inicializo la variable velocidad a 0
    }
    
    public void Acelerar(int cantidad){
        //Acelerar recibe como argumento el entero al que se le llama cantidad
        velocidad = velocidad + cantidad;
    }
    
    public void Frenar(int cantidad){
        //Frenar recibe como argumento el entero al que se le llama cantidad
        velocidad = velocidad - cantidad;
    }
    public int ObtenerVelocidad(){//No recibe argumentos
        return velocidad;
        //Obtener velocidad es de tipo int porque devuelve un valor de tipo entero
    }
    
    public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo();
        miCoche.Arrancar();
        miCoche.Acelerar(12);
        miCoche.Frenar(5);
        System.out.println(miCoche.ObtenerVelocidad());
    }
    
}
