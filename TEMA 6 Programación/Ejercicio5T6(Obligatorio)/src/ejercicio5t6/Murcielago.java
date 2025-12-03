/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author angel
 */
public class  Murcielago extends Mamifero implements Volador {
    private double AlturaVuelo;
    
    public Murcielago(){
        super();
        this.AlturaVuelo = 0;
    }
    
    public Murcielago(String nombre, String sexo, String color, int edad, double AlturaVuelo){
        super(nombre, color, sexo, edad);
        this.AlturaVuelo = AlturaVuelo;
    }
    
    public double getAlturaVuelo(){
        return AlturaVuelo;
    }
    
    public void setAlturaVuelo(){
        this.AlturaVuelo = AlturaVuelo;
    }
    
    @Override 
    public String obtenerMensajeVol(){
        return "Murcielago: soy un mamifero volador, especializado en vuelo nocturno";
    }
    @Override
    public void aumentoVuelo(double m) {
        if (m > 0) {
            AlturaVuelo += m;
            System.out.println(getNombre() + " ha subido " + m + " m. Altura actual: " + AlturaVuelo + " m.");
        } else {
            System.out.println("Incremento no válido.");
        }
    }
    public void disminuirVuelo(double m) {
        if (m > 0) {
            AlturaVuelo = Math.max(0.0, AlturaVuelo - m);
            System.out.println(getNombre() + " ha bajado " + m + " m. Altura actual: " + AlturaVuelo + " m.");
        } else {
            System.out.println("Decremento no válido.");
        }
    }
    @Override
    public double alturaVuelo() {
        return AlturaVuelo;
    }
    
    @Override
    public String toString() {
        return super.toString().replace(" }", "") +
               ", alturaVuelo = " + AlturaVuelo + " m ";
    }
}
