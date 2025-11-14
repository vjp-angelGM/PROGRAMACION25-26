/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t5;

/**
 *
 * @author angel
 */
public class Coche {

    //Atributos
    public String marca;
    private String modelo;
    private Rueda ruedas;

    //Métodos set
    public String obtenerMarca() {
        return marca;
    }

    //Métodos set
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    //Métodos get
    public String obtenerModelo() {
        return modelo;
    }

    //Métodos set
    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    //Métodos get
    public Rueda obtenerRuedas() {
        return ruedas;
    }

    //Métodos set
    public void establecerRuedas(Rueda ruedas) {
        this.ruedas = ruedas;
    }

}
