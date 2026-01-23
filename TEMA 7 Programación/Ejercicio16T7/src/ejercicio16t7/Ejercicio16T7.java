/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio16T7 {

    /**
     * @param args the command line arguments
     */
    public static int pedirOpcion(){ // Creamos el método para que pida la opcion
        Scanner entrada = new Scanner (System.in);
        try{
            int opcion = entrada.nextInt();
            return opcion;
        }catch (InputMismatchException e){
            entrada.nextLine();
            System.out.println(e);
        }
        return -1;
    }
    
     public static void pedirNota(int [][] notas, String[] alumnos, String[] asignaturas) { //Creamos el método para que pida las notas 
         /* pasandole el array de notas, el de alumnos y el de asignaturas */
        Scanner entrada = new Scanner(System.in); 
         System.out.println("Introduce las notas por favor: "); // Mostramos el mensaje por pantalla de que introduzca las notas
        for (int i = 0; i < notas.length; i++){
            System.out.println("Alumno : "+alumnos[i]); // Mostramos el alumno 
            for (int j = 0; j < notas[i].length; j++){
                System.out.println("Asignatura : "+asignaturas[j]); // Mostramos las asignaturas
                notas [i][j] = entrada.nextInt();
            }
        }
    }
     
    public static void mostrarNotas(int [][] notas, String [] alumnos, String [] asignaturas){
        for (int i = 0; i < notas.length; i++){
            System.out.println("Alumno: "+alumnos[i]);
            for (int j = 0; j < notas[i].length; j++){
                System.out.println("Asignatura: "+asignaturas[j]+ " : "+notas[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMejorAlumno(int [][] notas, String [] alumnos, String [] asignaturas){
        int suma = 0;
        double [] media = new double [notas.length];
        for (int i = 0; i < notas.length; i++){
            suma = 0;
            for (int j = 0; j < notas[i].length; j++){
                suma+= notas[i][j];
            }
            media[i] = suma / notas[i].length;
        }
       double mejorMedia = media[0];
       int mejor = 0;
       
       for (int i = 0; i < media.length; i++){
          if (media [i] > mejorMedia){
              mejorMedia = media[i];
              mejor = i;
           }
       }
        System.out.println("El mejor alumno es: "+alumnos[mejor]+" con una nota media de: "+mejorMedia);
    }
    
    public static void mostrarAlumnoSuspensos(int [][] notas, String [] alumnos, String [] asignaturas){
        int suma = 0;
        double [] media = new double [notas.length];
        
        for (int i = 0; i< notas.length; i++){
            suma = 0;
            for (int j = 0; j < notas[i].length; j++){
                suma+= notas[i][j];
            }
            media[i] = suma / notas[i].length;
        }
        double peorMedia = media[0];
        int peor = 0;
        
        for (int i = 0; i < media.length; i++){
            if (media[i] > peorMedia){
                peor = i;
            }
        }
        System.out.println("El peor alumno es: "+alumnos[peor]+" con una nota media de: "+peorMedia);
    }
    public static void mostrarMenu(){
        System.out.println("========== MENU DE NOTAS DE ALUMNOS ===========");
        System.out.println("==== Bienvenido al menu de notas de los alumnos ====");
        System.out.println("=================================================");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas de los alumnos");
        System.out.println("3. Mostrar el mejor alumno de la clase");
        System.out.println("4. Mostrar alumno con más suspensos");
        System.out.println("5. Mostrar la asignatura más dificil");
        System.out.println("6. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opción: ");
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String [] alumnos = {"Pepe","Ana","Juan","Marta","Pedro","Maria"};
        String [] asignaturas = {"Lengua","Mates","Historia","Fisica"};
        int opcion = 0;
        int [][] notas = new int[6][4];
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion){
                case 1:{
                    pedirNota(notas, alumnos, asignaturas);
                    break;
                }
                case 2: {
                    mostrarNotas(notas, alumnos, asignaturas);
                    break;
                }
                case 3: {
                    mostrarMejorAlumno(notas, alumnos, asignaturas);
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                
                case 6: {
                    System.out.println("Has elegido salir del programa. Hasta pronto!!!!!");
                    break;
                }
                default: 
                    System.out.println("Opción introducida no válida");
            }
        }while (opcion != 6);
    }
    
}
