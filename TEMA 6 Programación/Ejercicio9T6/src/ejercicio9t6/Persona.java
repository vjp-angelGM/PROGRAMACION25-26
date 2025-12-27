/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t6;

/**
 *
 * @author angel
 */
public class Persona implements Gravable {

    private String DNI;
    private float ingresosAnuales;

    public Persona() { //Creamos el constructor por defecto
        this.DNI = "";
        this.ingresosAnuales = 0.0f;
    }

    public Persona(String DNI, float ingresosAnuales) { //Creamos el constructor parametrizado
        this.DNI = DNI;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getIngresos() {
        return ingresosAnuales;
    }

    public void setIngresos(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

   @Override
    public float calcularImpuesto() {
        double impuesto = 0;
        
        if (ingresosAnuales <= 12450) {
            impuesto = ingresosAnuales * 0.19;
        } else if (ingresosAnuales <= 20200) {
            impuesto = ingresosAnuales * 0.24;
        } else if (ingresosAnuales <= 35200) {
            impuesto = ingresosAnuales * 0.30;
        } else if (ingresosAnuales <= 60000) {
            impuesto = ingresosAnuales * 0.37;
        } else if (ingresosAnuales <= 300000) {
            impuesto = ingresosAnuales * 0.45;
        } else {
            impuesto = ingresosAnuales * 0.47;
        }
        
        return (float) impuesto;
    }
    
    @Override
    public String toString() {
        return "Persona [DNI: " + DNI + ", Ingresos: " + ingresosAnuales + 
               "€, IRPF: " + calcularImpuesto() + "€]";
    }
}

