/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t6;

/**
 *
 * @author angel
 */
public class Ejercicio7T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.encenderTV();
        System.out.println(radio);
        radio.subirVol();
        radio.subirVol();
        radio.subirVol();
        System.out.println(radio.getVolumen());
        radio.cambiarCanal(90.3f);
        radio.bajarVol();
        System.out.println(radio.getVolumen());
        radio.apagarTV();
        System.out.println(radio);

        System.out.println("");

        Televisor tv = new Televisor();
        tv.encenderTV();
        System.out.println(tv);
        tv.subirVol();
        tv.subirVol();
        tv.subirVol();
        System.out.println(tv.getVolumen());
        tv.cambiarCanal(7);
        tv.bajarVol();
        System.out.println(tv.getVolumen());
        tv.apagarTV();
        System.out.println(tv);
    }
}
