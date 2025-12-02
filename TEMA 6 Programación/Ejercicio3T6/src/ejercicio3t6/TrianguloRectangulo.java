/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public class TrianguloRectangulo extends Triangulo {
    public TrianguloRectangulo(){
        super();
    }
    
    public TrianguloRectangulo(String color, int base, int altura){
        super (base,altura,color);
    }
    
    public double calculoHipotenusa(){
        int base = getBase();
        int altura = getAltura();
        return Math.sqrt((base * base)+ (altura * altura));
    }
    
    public String tipoTriangulo(){
        double lado1 = getBase();
        double lado2 = getAltura();
        double lado3 = calculoHipotenusa();
        
        if (lado1 == lado2 && lado2 == lado3){
            return "Equilátero";
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return "Isosceles";
        }else {
            return "Escaleno";
        }
    }
}
