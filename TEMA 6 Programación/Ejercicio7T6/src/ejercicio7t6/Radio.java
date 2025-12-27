/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t6;

/**
 *
 * @author angel
 */
public class Radio implements ControlRemoto {

    private boolean encendido;
    private float emisora;
    private int volumen;

    public Radio() {
        this.encendido = false;
        this.volumen = 12;
        this.emisora = 80.0f;
    }

    public Radio(int volumen, float emisora) {
        this.encendido = false;
        this.volumen = volumen;
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    @Override
    public void apagarTV() {
        if (encendido) {
            encendido = false;
        }
    }

    @Override
    public void encenderTV() {
        if (!encendido) {
            encendido = true;
        }
    }

    @Override
    public void bajarVol() {
        if (encendido) {
            volumen -= 5;
        }
    }

    @Override
    public void subirVol() {
        if (encendido) {
            volumen += 5;
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            emisora = canal;
        }
    }

    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", volumen=" + volumen + ", emisora=" + emisora + '}';
    }

}
