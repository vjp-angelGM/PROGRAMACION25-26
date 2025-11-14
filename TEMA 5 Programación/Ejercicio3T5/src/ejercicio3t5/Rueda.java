/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t5;

/**
 *
 * @author angel
 */
public class Rueda {
    private String material;
    private int pulgadas;
    
    public void establecerMaterial(String mater){
        material = mater;
    }
    public void establecerPulgadas (int pulg){
        pulgadas = pulg;
    }
    
    public String obtenerMaterial(){
        return material;
    }
    
    public int obtenerPulgadas(){
        return pulgadas;
    }
    
}
