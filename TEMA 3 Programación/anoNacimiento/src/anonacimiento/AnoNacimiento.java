/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonacimiento;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class AnoNacimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoAc, anoNac, diaAc, diaNac, mesAc, mesNac, anos, meses, dias;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la fecha actual: ");
        System.out.println("Año actual: ");
        anoAc = entrada.nextInt();
        System.out.println("Mes actual ( 1 - 12 ) ");
        mesAc = entrada.nextInt();
        System.out.println("Dia actual ( 1 -  31) ");
        diaAc = entrada.nextInt();

        System.out.println("\n Introduce tu fecha de nacimiento: ");
        System.out.println("Año de nacimiento: ");
        anoNac = entrada.nextInt();
        System.out.println("Mes de nacimiento: ");
        mesNac = entrada.nextInt();
        System.out.println("Dia de nacimiento: ");
        diaNac = entrada.nextInt();

        if (anoNac >= anoAc) {
            System.out.println("\n Error: La fecha de nacimiento no puede ser posterior. ");
        } else {
            anos = anoAc - anoNac;
            meses = mesAc - mesNac;
            dias = diaAc - diaNac;

            if (dias < 0) {
                dias += 30;
                meses--;
            }

            if (meses < 0) {
                anos--;
                meses += 12;
            }
            System.out.println("Su edad exacta es de " + anos + " años " + meses + " meses y " + dias + " dias.");
        }

    }

}
