/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocochet5;

/**
 *
 * @author angel
 */
public class EjercicioCocheT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos la variable velocidad
        int velocidad;
        //Creo los dos objetos de la clase coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        //Establezco los valores al primer coche
        miCoche.establecerMarca("Volkswaggen");
        miCoche.establecerModelo("Scirocco");
        miCoche.establecerColor("Verde");
        
        //Establezco los valores al segundo coche
        cochePadre.establecerMarca("BMW");
        cochePadre.establecerModelo("Z3");
        cochePadre.establecerColor("Negro");
        
        //Arranco los dos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        //El primer coche acelera 5 veces
        for (velocidad = 0; velocidad < 5; velocidad++) {
            miCoche.acelerarCoche();
        }
        
        //El primer coche frena 2 veces
        for (velocidad = 0; velocidad < 2; velocidad++) {
            miCoche.frenarCoche();
        }
        
        //El segundo coche acelera 3 veces
        for (velocidad = 0; velocidad < 3; velocidad++) {
            cochePadre.acelerarCoche();
        }
        
        //El segundo coche se apaga
        cochePadre.apagarCoche();
        
        //Se muestra el estado de los coches
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
    }
}
