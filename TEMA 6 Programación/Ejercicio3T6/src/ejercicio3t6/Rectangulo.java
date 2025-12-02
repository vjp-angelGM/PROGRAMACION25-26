/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public class Rectangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(int base, int altura,String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calculoArea() {
        int area = base * altura;
        System.out.println("El area del rectángulo es " + area);
    }
    
    @Override 
    public void calculoPerimetro(){
        double perimetro =  ((2*base)+ (2*altura));
        System.out.println("El perimetro del rectángulo es: "+perimetro);
    }
    @Override 
    public String toString(){
        return "El rectángulo es de color "+getColor()+" y tiene una base de " +getBase()+" y una altura de : "+getAltura();
    }
    
}
