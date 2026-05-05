/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author angel
 */
public class Ejercicio9T12 {

    /**
     * @param args the command line arguments
     */
    public static String invertir(String texto) {
        String textoIn = "";

        for (int i = textoIn.length() - 1; i >= 0; i--) {
            textoIn = textoIn + textoIn.charAt(i);
        }
        return textoIn;
    }

    public static void transformar() throws FileNotFoundException, IOException {
        String archivoIn = "frase.txt";  //declaro la variable en la que estara el texto
        String archivoOut = "fraseinvertida.txt"; //variable donde guardo textoinvertido.

        try (FileReader fr = new FileReader(archivoIn); BufferedReader br = new BufferedReader(fr)) {
            //1º leer el texto de archivoEntrada 
            String textoEntrada = br.readLine();

            //2º comprobamos que el archivo no esta a null. si no está llamamos al  metodo invertir
            if (textoEntrada != null) {

                String textoReves = invertir(textoEntrada);

                //3º Abrimos flujo de escritura para guardar el texto al reves en otro archivo
                try (FileWriter fw = new FileWriter(archivoOut); PrintWriter pw = new PrintWriter(fw)) {
                    //imprimimos el texto al reves que hemos guardado 
                    pw.print(textoReves);
                    //damos un feedback al usuario
                    System.out.println("Archivo guardado correctamente en: " + archivoOut);

                }
            } else {
                System.out.println("El archivo está vacio");
            }
        }
    }

    public static void main(String[] args)throws IOException  {
        try{
            transformar();
            System.out.println("Texto invertido");
        }catch (FileNotFoundException e){
            System.out.println("Errror. No se encuentra el archivo ");
        }catch(IOException e){
            System.out.println("Error al procesar el archivo " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error inesperado "+e.toString());
        }
    }

}
