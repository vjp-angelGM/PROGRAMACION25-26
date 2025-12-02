/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author angel
 */
public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre,String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    public Profesor(){
        super();
        this.especialidad ="";
    }
    @Override
    public void saludar(){
        System.out.println("Soy el profesor "+getNombre()+" y soy de la especialidad de "+especialidad);
    }
}
