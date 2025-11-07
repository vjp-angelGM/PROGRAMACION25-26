/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author angel
 */
public class Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIAR UN OBJETO DEL TIPO QUE HE CREADO
        //Const. Parametrizado y estableciendo valores con SETTERS
        Coche micoche = new Coche();
        System.out.println(micoche.toString());
        micoche.setEspejos(5);
        System.out.println(micoche.toString());
        micoche.acelerar();
        System.out.println(micoche.getEspejos());

        //Const. parametrizado, inicializando los atributos con los valores por parametro
        Coche tuCoche = new Coche("Michelin", "Bajo", 3);
        System.out.println(tuCoche.toString());
        
        System.out.println(tuCoche.getRuedas());
    }

}
