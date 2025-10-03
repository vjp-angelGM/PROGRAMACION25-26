/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

/**
 *
 * @author angel
 * @since 22/09/2025
 * NOTAS EXAMEN
 * TEMA 2 PROGRAMACIÓN
 */
public class Notas {
    private static final int NOTA1 = 7; //Declaro la constante de NOTA 1 y la inicializo
    private static final int NOTA2 = 5; //Declaro la constante de NOTA2 y la inicializo
    private static final String ASIGNATURA = "Programacion";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float NOTAMEDIA;
      NOTAMEDIA = (NOTA1 + NOTA2) /2;
        System.out.println("En la asignatura de "+ASIGNATURA+" tienes "+NOTA1+ " y "+NOTA2);
        System.out.println("Nota media de la asignatura es :  "+NOTAMEDIA);
    }
    
}
