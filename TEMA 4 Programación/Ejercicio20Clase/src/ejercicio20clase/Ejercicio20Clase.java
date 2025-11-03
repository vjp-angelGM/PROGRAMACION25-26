/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20clase;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio20Clase {

    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static int PUNTUACIÓN = 5;
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";

    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuestaUsuario = entrada.nextLine();
        return respuestaUsuario;
    }
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta){
        boolean correcto;
        if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        if (comprobarRespuesta(respuesta,RESPUESTA1)){
            System.out.println("Muy bien respuesta correcta!!! ");
            puntuacionFinal += PUNTUACIÓN;
        }else {
            
        }
        

    }

}
