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
        //MODIFICADORES DE ACCESO
        Bicicleta bicicleta = new Bicicleta();
        System.out.println("¿Cuantas bicis hemos creado?");
        System.out.println(bicicleta.getNumBicis());
//        System.out.println(bicicleta.getEstaPedaleando());

//PASO DE PARAMETROS POR VALOR O REFERENCIA
        int num1 = 4;
        System.out.println(suma(num1));
        
        Bicicleta bici = new Bicicleta();
        empezarAPedalear(bici);
    }
     public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
    }


    public static int suma(int num1) {
        int num2 = 3;
        return num1 + num2;
    }

}
