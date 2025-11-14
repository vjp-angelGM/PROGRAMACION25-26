/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t5;

/**
 *
 * @author admin
 */
public class Ejercicio05T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura Prog = new Asignatura("Programación");
        Asignatura Lm = new Asignatura("Lenguaje marcas");
        Asignatura Bbdd = new Asignatura("BBDD");
        Asignatura Ed = new Asignatura("Entornos desarrollo");
        Asignatura Si = new Asignatura("Sistemas informáticos");
        Asignatura Fol = new Asignatura("Formación y Orientación Laboral");
        
        Prog.setNota(6);
        Lm.setNota(7);
        Bbdd.setNota(8);
        Ed.setNota(10);
        Si.setNota(10);
        Fol.setNota(9);
        
        System.out.println("Media: "+Asignatura.calcularMedia(Prog.getNota(), Lm.getNota(), Bbdd.getNota(), 10, 10, 9));
        
        
    }
    
}
