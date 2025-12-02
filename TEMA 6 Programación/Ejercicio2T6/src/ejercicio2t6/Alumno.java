/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author angel
 */
public class Alumno extends Persona {
    private String grupo;
    
    public Alumno(String nombre,String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
    public Alumno(){
        super();
        this.grupo ="";
    }
    
   @Override
   public void saludar(){
       System.out.println("Hola soy el alumno "+getNombre()+" y estoy en el grupo "+grupo);
   }
    
}
