/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumno;

import static notasalumno.pedirnota.pedirNota;

/**
 *
 * @author angel
 */
public class NotasAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        nota = pedirNota(0);
        System.out.println("La nota introducida fue: " + nota);
    }

}
