/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t6;

/**
 *
 * @author angel
 */
public class Persona implements Transformar {

    private String nombre;
    private String apellidos;
    private String alias;

    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }

    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
        int total = contar(nombre) + contar(apellidos) + contar(alias);
        System.out.println("Vocales en Persona: " + total);
    }

    private int contar(String s) {
        int c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') c++;
        }
        return c;
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = nombre;

        if (apellidos.length() > mayor.length()) mayor = apellidos;
        if (alias.length() > mayor.length()) mayor = alias;

        return mayor;
    }

    @Override
    public boolean buscarCadena(String s) {
        return nombre.equals(s) || apellidos.equals(s) || alias.equals(s);
    }
}