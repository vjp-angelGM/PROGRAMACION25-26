/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public  class Cuadrado extends FiguraGeometrica {

    private int lado;

    public Cuadrado(){
        super();
        this.lado=0;
    }
    public Cuadrado (int lado,String color){
        super(color);
        this.lado = lado;
    }
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado){
        this.lado = lado;
    }
    
    @Override
    public void calculoArea(){
        int area = lado * lado;
        System.out.println("El área del cuadrado es: "+area);
    }
    
    @Override 
    public void calculoPerimetro(){
        int perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: "+perimetro);
    }
    @Override 
    public String toString(){
        return "Cuadrado de color "+getColor()+" y de lado "+lado;
    }
}
