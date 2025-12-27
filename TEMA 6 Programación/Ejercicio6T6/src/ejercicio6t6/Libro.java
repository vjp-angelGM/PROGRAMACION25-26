/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t6;

/**
 *
 * @author angel
 */
public class Libro implements Transformar {

    private String titulo;
    private String autor;
    private String genero;

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
        int total = contar(titulo) + contar(autor) + contar(genero);
        System.out.println("Vocales en Libro: " + total);
    }

    private int contar(String s) {
        int c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        return c;
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = titulo;

        if (autor.length() > mayor.length()) {
            mayor = autor;
        }
        if (genero.length() > mayor.length()) {
            mayor = genero;
        }

        return mayor;
    }

    @Override
    public boolean buscarCadena(String s) {
        return titulo.equals(s) || autor.equals(s) || genero.equals(s);
    }
}
