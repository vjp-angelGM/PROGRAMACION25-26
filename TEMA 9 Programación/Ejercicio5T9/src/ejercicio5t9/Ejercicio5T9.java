/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t9;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio5T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array con los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Solicitar día al usuario
        System.out.print("Introduce un día de la semana: ");
        String diaIngresado = scanner.nextLine();

        // Buscar la posición del día en el array
        int posicion = -1;
        for (int i = 0; i < diasSemana.length; i++) {
            if (diasSemana[i].equalsIgnoreCase(diaIngresado)) {
                posicion = i + 1; // +1 porque la posición empieza en 1, no en 0
            }
        }

        // Mostrar resultado
        if (posicion != -1) {
            System.out.println("Es el " + getNumeroOrdinal(posicion) + " día de la semana");
        } else {
            System.out.println("El día introducido no es válido");
        }

        scanner.close();
    }

    public static String getNumeroOrdinal(int numero) {
        String[] ordinales = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};
        return ordinales[numero - 1];
    }
}
