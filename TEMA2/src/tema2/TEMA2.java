
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;

/**
 *
 * @author Ángel 
 * @since 23/09/2025
 * TEMA 2 PROGRAMACIÓN - APUNTES Y EJEMPLOS
 */

//CLASE PRINCIPAL
public class TEMA2 {
    
    //=========================
    // CONSTANTES (inmutables)
    //=========================
    // Buena práctica: usar final + mayúsculas
    final static char LETRA_DNI = 'Q';  //Recordar que hay que poner el STATIC sino no podemos acceder a las constantes
    // Esta variable es global (accesible desde todo el programa)
    
    //=========================
    // ATRIBUTOS (características de un objeto)
    //=========================
    int health = 100;          // Vida inicial
    int levels = 100;          // Número de niveles
    String genre = "RPG";      // Género del juego
    
    //=========================
    // MÉTODOS (comportamientos)
    //=========================
    public static void iniciar() {
        System.out.println("Iniciando Juego.....");
    }
    
    public static void mostrarMenu() {
        System.out.println("----- Menú ------");
        System.out.println("1. Iniciar");
        System.out.println("2. Seleccionar nivel");
        System.out.println("3. Opciones");
        System.out.println("4. Salir");
    }
    
    //=========================
    // MÉTODO PRINCIPAL
    //=========================
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //-------------------------
        // VARIABLES
        //-------------------------
        // Se declaran con un tipo específico
        int tiempo = 3;           // Entero
        float notaMedia = 6.54F;  // Número en coma flotante (precisión de 7 cifras)
        
        // LLAMAR A MÉTODOS
        iniciar();
        mostrarMenu();
        
        //-------------------------
        // DECLARAR e INICIALIZAR
        //-------------------------
        char letra;         // Declaración
        letra = 'Q';        // Inicialización
        System.out.println(letra);
        
        // Declarar e inicializar en la misma línea
        boolean encontrado = true;
        
        // Declarar varias variables del mismo tipo
        int edad = 30, niveles = 100, vida = 100;
        
        //-------------------------
        // APUNTES DE TEORÍA (RESUMEN)
        //-------------------------
        
        // 1. TIPOS DE DATOS PRIMITIVOS EN JAVA
        // byte, short, int, long  -> Enteros
        // float, double           -> Decimales
        // char                    -> Carácter
        // boolean                 -> true / false
        
        // 2. CONSTANTES
        // Se definen con final y NO cambian de valor.
        
        // 3. OPERADORES
        // Aritméticos: + - * / %
        // Relacionales: > < >= <= == !=
        // Lógicos: && || !
        
        // 4. ESTRUCTURA BÁSICA DE UN PROGRAMA EN JAVA
        // - Paquete
        // - Clase principal
        // - Atributos
        // - Métodos
        // - Método main (punto de entrada)
        
        // 5. BUENAS PRÁCTICAS
        // - Nombrar constantes en MAYÚSCULAS
        // - Nombrar variables en camelCase
        // - Usar comentarios para documentar
        // - Mantener código ordenado y legible
    }
}