/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t6;

/**
 *
 * @author angel
 */
public class Ejercicio3T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== FIGURAS GEOMÉTRICAS ==========");
        System.out.println();
        
        System.out.println("========== RECTANGULO ==========");
        Rectangulo rect = new Rectangulo(10,12,"Verde"){};//Creamos un rectangulo de base 10 y de altura 12 y de color verde 
        rect.calculoArea(); //Calculo el área
        rect.calculoPerimetro(); // Calculo el perimetro
        System.out.println(rect); // Muestro el rectangulo haciendo referencia al método toString 
        System.out.println();
        
        System.out.println("========== CIRCULO ==========");
        Circulo circ = new Circulo("Rojo",3){};
        circ.calculoArea();//Calculo el área
        circ.calculoPerimetro();// Calculo el perimetro
        System.out.println(circ);//Muestro el circulo haciendo referencia al método toString 
        System.out.println();
        
        System.out.println("========== CUADRADO ==========");
        Cuadrado cuad = new Cuadrado (5,"Azul"){};
        cuad.calculoArea();//Calculo el área
        cuad.calculoPerimetro();//Calculo el perímetro
        System.out.println(cuad);//Muestro el cuadrado haciendo referencia al método toString
        System.out.println();
        
        System.out.println("========== TRIANGULO========== ");
        Triangulo tri = new Triangulo (4,4,"Rosa") {};
        tri.calculoArea();//Calculo el área
        tri.calculoPerimetro();//Calculo el perímetro
        System.out.println(tri);//Muestro el triangulo haciendo referencia al método toString
        System.out.println();
        
        FiguraGeometrica figu;
        TrianguloRectangulo trianguRec;
        
        System.out.println("===== POLIMORFISMO =======");
        figu = new Rectangulo(12,12,"Amarillo");
        figu.calculoArea();//Calculo el área
        figu.calculoPerimetro();//Calculo el perímetro
        System.out.println();
        
        figu = new Circulo("Bermellón",5);
        figu.calculoArea();//Calculo el área
        figu.calculoPerimetro();//Calculo el perímetro
        System.out.println();
        
        figu = new Cuadrado (10,"Pistacho");
        figu.calculoArea();//Calculo el área
        figu.calculoPerimetro();//Calculo el perímetro
        System.out.println();
        
        figu = new Triangulo(4,4,"Naranja");
        figu.calculoArea();//Calculo el área
        figu.calculoPerimetro();//Calculo el perímetro
        System.out.println();
        
        trianguRec = new TrianguloRectangulo("Cyan",4,4);
        System.out.println("El triangulo es "+trianguRec.tipoTriangulo());
        System.out.println();
    }
    
}
