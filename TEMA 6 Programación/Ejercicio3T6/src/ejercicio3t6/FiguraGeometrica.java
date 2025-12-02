/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public abstract class FiguraGeometrica {
    private String color;
    
    public FiguraGeometrica(){
        this.color="";
    }
    
    public FiguraGeometrica(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(){
        this.color = color;
    }
    
    
    public abstract void calculoArea();
    public abstract void calculoPerimetro();
}
