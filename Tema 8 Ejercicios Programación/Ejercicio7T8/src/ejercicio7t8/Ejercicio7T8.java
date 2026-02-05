/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio7T8 {

    /**
     * @param args the command line arguments
     */
    private static final int DIAS_MES = 30;
    private static final String[] DIAS_SEMANA = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    private static Dia[] temperaturasMes;

    public static void mostrarMenu() {
        System.out.println("=========== MENU TEMPERATURAS ==========");
        System.out.println("========== Bienvenido al menú ==========");
        System.out.println("1. Rellenar de forma aleatoria las temperaturas ");
        System.out.println("2. Mostrar las temperaturas del mes");
        System.out.println("3. Mostrar la temperatura media del mes");
        System.out.println("4. Mostrar el dia o dias más calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opción: ");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        try {
            int opcion = entrada.nextInt();
            return opcion;
        } catch (InputMismatchException e) {
            entrada.nextLine();
            System.out.println(e);
        }
        return -1;
    }

    public static void rellenarTemperatura() {
        Random random = new Random();
        System.out.println("====== RELLENANDO TEMPERATURAS =====");
        int primerDiaSemana = random.nextInt(6) + 1;
        if (primerDiaSemana == 0) {
            primerDiaSemana = 1;
        }
        for (int i = 0; i < DIAS_MES; i++) {
            int indiceDiaSemana = (primerDiaSemana + i) % 7;
            String nombreDia = DIAS_SEMANA[indiceDiaSemana];
            int temperatura = random.nextInt(40) + 1;

            temperaturasMes[i] = new Dia(nombreDia, temperatura);
        }
        System.out.println("TEMPERATURAS RELLENADAS CORRECTAMENTE");
        System.out.println("");
        System.out.println("(El dia 1 es " + temperaturasMes[0].getNombreDia() + ")");
        System.out.println("");
    }
    
    public static void mostrarTemperatura(Dia[] temperaturasMes) {
        System.out.println(" ======== MOSTRANDO EL ARRAY CON LAS TEMPERATURAS DEL MES ========");
        System.out.println("");
        for (int i = 0; i < temperaturasMes.length; i++) {
            System.out.println(temperaturasMes[i] + " ");
            }
        System.out.println("");
    }
    
    public static void verTemperaturaMedia(Dia[] temperaturasMes){
        System.out.println("======== MOSTRANDO LA TEMPERATURA MEDIA DEL MES =======");
        System.out.println("");
        int suma=0;
        for (int i=0; i < temperaturasMes.length; i++){
            suma+=temperaturasMes[i].getTemperatura();
        }
        double media = suma/temperaturasMes.length;
        System.out.println("La temperatura media del mes es: "+media+" ºC");
        System.out.println("");
    }

    public static void mostrarDiaCaluroso(Dia[] temperaturasMes){
        int tempMax = 0;
        System.out.println("====== MOSTRANDO EL DIA(S) MÁS CALUROSO =======");
        System.out.println("");
        for (int i=0; i < temperaturasMes.length;i++){
            tempMax = temperaturasMes[i].getTemperatura();
        }
        System.out.println("TEMPERATURA MÁXIMA: "+tempMax+" ºC");
        System.out.println("");
        System.out.println("El dia(s) más caluroso fue: ");
        for (int i=0; i < temperaturasMes.length;i++){
            if(temperaturasMes[i].getTemperatura() == tempMax){
                System.out.println("-> "+temperaturasMes[i]+" fue el dia más caluroso");
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        temperaturasMes = new Dia[DIAS_MES];
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1: {
                    rellenarTemperatura();
                    break;
                }
                case 2: {
                    mostrarTemperatura(temperaturasMes);
                    break;
                }
                case 3: {
                  verTemperaturaMedia(temperaturasMes);
                    break;
                }
                case 4: {
                  mostrarDiaCaluroso(temperaturasMes);
                    break;
                }
                case 5: {
                    System.out.println("Gracias por usar el programa! Hasta pronto.");
                    break;
                }
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opcion del 1 al 5");
            }
        } while (opcion != 5);
    }

}
