/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author angel
 */
public class Mamifero {

    private String nombre;
    private String color;
    private int edad;
    private String sexo;

    public Mamifero() {
        this.nombre = "";
        this.color = "";
        this.sexo = "";
        this.edad = 0;
    }
    
    public Mamifero(String nombre, String sexo, String color,int edad ){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    @Override
    
    public String toString(){
        return "Mamifero: Nombre: "+getNombre()+", sexo "+getSexo()+", color "+getColor()+" y edad "+getEdad();
    }
    
}
