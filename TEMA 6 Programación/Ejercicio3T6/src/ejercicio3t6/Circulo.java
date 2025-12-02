/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public  class Circulo extends FiguraGeometrica {

    private int radio;

    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    public void calculoArea() {
        double area = (Math.PI * radio * radio);
        System.out.println("El area del circulo es " + area);
    }
    
    @Override 
    public void calculoPerimetro(){
        double perimetro = 2*Math.PI * radio;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
    
    @Override
    public String toString(){
        return "Circulo de color "+getColor()+" y radio "+radio;
    }
}
