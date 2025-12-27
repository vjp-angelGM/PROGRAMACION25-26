/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8t6;

/**
 *
 * @author angel
 */
public class Ejercicio8T6 {

    /**
     * @param args the command line arguments
     */
    public static void procesarVehiculo(Vehiculo vehiculo) {
        vehiculo.mostrarMovimiento();

        if (vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
    }

    public static void main(String[] args) {
        Vehiculo miCoche = new Coche(100);
        Vehiculo miMoto = new Moto(80);

        procesarVehiculo(miCoche);
        System.out.println(); // Separador visual
        procesarVehiculo(miMoto);
    }

    }
    
