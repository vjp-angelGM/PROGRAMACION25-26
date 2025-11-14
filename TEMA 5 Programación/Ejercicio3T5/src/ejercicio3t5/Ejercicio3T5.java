/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t5;

/**
 *
 * @author angel
 */
public class Ejercicio3T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();

        //Establecemos el material y el tamaño de las ruedas
        //rueda1.establecerMaterial("Caucho");
        //Poner material como público: rueda1.material = "Caucho";
        rueda1.establecerMaterial("Caucho");
        rueda1.establecerPulgadas(220);

        rueda2.establecerMaterial("Caucho reforzado");
        rueda2.establecerPulgadas(230);

        //Mostramos los datos de las ruedas
        System.out.println("RUEDAS");
        System.out.println("Material: " + rueda1.obtenerMaterial() + " - Pulgadas: " + rueda1.obtenerPulgadas());
        System.out.println("Material: " + rueda2.obtenerMaterial() + " - Pulgadas: " + rueda2.obtenerPulgadas());

        //Creamos objetos Coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        //Establecemos marcas y modelos
        coche1.establecerMarca("Porsche");
        coche1.establecerModelo("Cayenne");

        coche2.establecerMarca("Mercedes ");
        coche2.establecerModelo("AMG");

        coche3.establecerMarca("Jeep");
        coche3.establecerModelo("Renegade");

        //Establecemos ruedas a los coches
        coche1.establecerRuedas(rueda1);
        coche2.establecerRuedas(rueda1);
        coche3.establecerRuedas(rueda2);

        coche1.marca = "Ferrari";
        //Mostramos datos de los coches
        System.out.println("COCHES");
        Rueda rAux = coche1.obtenerRuedas();
        System.out.println("Marca: " + coche1.obtenerMarca()
                + "\nModelo: " + coche1.obtenerModelo()
                + "\nMaterial: " + rAux.obtenerMaterial()
                + "\nPulgadas: " + coche1.obtenerRuedas().obtenerPulgadas());
        System.out.println();
        System.out.println("Marca: " + coche2.obtenerMarca()
                + "\nModelo: " + coche2.obtenerModelo()
                + "\nMaterial: " + coche2.obtenerRuedas().obtenerMaterial()
                + "\nPulgadas: " + coche2.obtenerRuedas().obtenerPulgadas());
        System.out.println();
        System.out.println("Marca: " + coche3.obtenerMarca()
                + "\nModelo: " + coche3.obtenerModelo()
                + "\nMaterial: " + coche3.obtenerRuedas().obtenerMaterial()
                + "\nPulgadas: " + coche3.obtenerRuedas().obtenerPulgadas());
    }

}
