/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caritmetica2;

/**
 *
 * @author angel
 * Calculadora Aritmetica 2
 * @since 20/09/2025
 * TEMA 1 PROGRAMACIÓN
 */
public class CAritmetica2 {

    public static void main(String[] args) {
        int dato1; //Declaro la variable dato1
        int dato2; //Declaro la variable dato2
        int dato3; //Declaro la variable dato3
        int resul; //Declaro la variable resultado
        
        dato1 = 120; //Asigno el valor de la variable dato1
        dato2 = 40;  //Asigno el valor de la variable dato2
        dato3 = 3;   //Asigno el valor de la variable dato3
        
        //SUMA
        resul = dato1 + dato2 + dato3; //Guardo el resultado de todas las variables 
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resul);/* El método println escribe por pantalla el valor de la variable */
        
        //RESTA
        resul = dato1 - dato2 - dato3; //Guardo el resultado de todas las variables 
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resul);/* El método println escribe por pantalla el valor de la variable */
        
        //PRODUCTO
        resul = dato1 * dato2 * dato3; //Guardo el resultado de todas las variables 
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resul);/* El método println escribe por pantalla el valor de la variable */
        
        //COCIENTE
        resul = dato1 / dato2 / dato3; //Guardo el resultado de todas las variables 
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resul);/* El método println escribe por pantalla el valor de la variable */
    }
}