/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t6;

/**
 *
 * @author angel
 */
public class Vehiculo implements Gravable {
    private int CC;
    private String Matricula;
    private String DNIPro;
    
    public Vehiculo (){
        this.CC = 0;
        this.Matricula = "";
        this.DNIPro = "";
    }
    
    public Vehiculo (int CC, String Matricula, String DNIPro){
        this.CC = CC;
        this.Matricula = Matricula;
        this.DNIPro = DNIPro;
    }
    
    public int getCC(){
        return CC;
    }
    
    public void setCC(int CC){
        this.CC = CC;
    }
    
    public String getMatricula(){
        return Matricula;
    }
    
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }
    
    public String getDNIPro(){
        return DNIPro;
    }
    
    public void setDNIPro(String DNIPro){
        this.DNIPro = DNIPro;
    }
    
    // Implementación del método de la interfaz
    @Override
    public float calcularImpuesto() {
        double impuesto = 0;
        
        if (CC < 1000) {
            impuesto = 12;
        } else if (CC <= 1499) {
            impuesto = 34;
        } else if (CC <= 1999) {
            impuesto = 71;
        } else if (CC <= 2999) {
            impuesto = 122;
        } else {
            impuesto = 152;
        }
        
        return (float) impuesto;
    }
    
    @Override
    public String toString() {
        return "Vehiculo [Matrícula: " + Matricula + ", CC: " + CC + 
               ", DNI Propietario: " + DNIPro + 
               ", Impuesto circulación: " + calcularImpuesto() + "€]";
    }
}
