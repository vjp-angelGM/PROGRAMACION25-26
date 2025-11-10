/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocochet5;

/**
 *
 * @author angel
 */
public class Coche {

     //Declaro los atributos privados
        private String marca;
        private String modelo;
        private String color;
        private int velocidad;
        private boolean motorEncendido;

        
        public void establecerMarca(String marca) {
            this.marca = marca;
        }

        public void establecerModelo(String modelo) {
            this.modelo = modelo;
        }

        public void establecerColor(String color) {
            this.color = color;
        }

        public void arrancarCoche() {
            this.motorEncendido = true;
            this.velocidad = 10;
        }

        public void apagarCoche() {
            this.motorEncendido = false;
            this.velocidad = 0;
        }

        public void acelerarCoche() {
            this.velocidad = this.velocidad + 20;
        }

        public void frenarCoche() {
            this.velocidad = this.velocidad - 6;
        }

        public void obtenerEstado() {
            System.out.println("Marca: " + this.marca);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Color: " + this.color);
            System.out.println("Velocidad: " + this.velocidad);
            if (this.motorEncendido) {
                System.out.println("Estado: ENCENDIDO");
            } else {
                System.out.println("Estado: APAGADO");
            }
        }
    }