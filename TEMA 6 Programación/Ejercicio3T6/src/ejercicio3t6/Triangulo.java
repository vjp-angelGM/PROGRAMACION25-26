/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public class Triangulo extends FiguraGeometrica{
    private int base;
    private int altura;
    
    public Triangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(int base, int altura,String color){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    @Override 
    public void calculoArea(){
        double area = (base * altura ) / 2;
        System.out.println("El area del triangulo es: "+area);
    }
    
    @Override 
    public void calculoPerimetro(){
        int lado = 3;
        int perimetro = lado + lado + lado;
        System.out.println("El perimetro del triangulo es: "+perimetro);
    }
    
    @Override 
    public String toString(){
        return "El triangulo es de color "+getColor()+" y tiene una base de "+getBase()+" y una altura de "+getAltura();
    }
}
