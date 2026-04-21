/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t12;
/**
 *
 * @author angel
 */
public class Contacto {
    private String nombre;
    private int edad;
    private int nTelefono;

    public Contacto (){
        this.nombre ="";
        this.edad = 0;
        this.nTelefono = 0;
    }
    
    public Contacto(String nombre, int edad, int nTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.nTelefono = nTelefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int compareTO(Contacto otro){
        return Integer.compare(this.edad, otro.getEdad());
    }
    
    @Override
    public String toString() {
        return "Contacto{" + "nombre = " + nombre + ", edad = " + edad + ", nTelefono = " + nTelefono + '}';
    }
    
    
    
}
