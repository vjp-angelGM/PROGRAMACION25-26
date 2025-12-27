/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t6;

/**
 *
 * @author angel
 */
public class Televisor implements ControlRemoto {

    private boolean encendido;
    private int canal;
    private int volumen;

    public Televisor() {
        this.canal = 1;
        this.volumen = 10;
        this.encendido = false;
    }

    public Televisor(int canal, int volumen, boolean encendido) {
        this.canal = canal;
        this.encendido = encendido;
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //Método Override
    @Override
    public void apagarTV() {
        if (encendido = true) {
            System.out.println("La televisión se apagará en 10 s");
            encendido = false;
        }
    }

    @Override
    public void encenderTV() {
        if (!encendido) {
            encendido = true;
            System.out.println("La televisión se ha encendido. El canal actual es " + getCanal() + " y el volumen actual es: " + getVolumen());
        }
    }

    @Override
    public void bajarVol() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void subirVol() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Estás viendo el canal " + canal);
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }

}

