/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t6;

/**
 *
 * @author angel
 */
public class ColeccionCadena implements Transformar {
    private String cad1;
    private String cad2;
    private String cad3;
    
    public ColeccionCadena(String cad1, String cad2, String cad3) {
        this.cad1 = cad1;
        this.cad2 = cad2;
        this.cad3 = cad3;
    }

    @Override
    public String concatenarTodo() {
        return cad1 + "#" + cad2 + "#" + cad3;
    }

    @Override
    public String obtenerIniciales() {
        return "" + cad1.charAt(0) + cad2.charAt(0) + cad3.charAt(0);
    }

    @Override
    public void contarVocales() {
        int total = contarVocalesCadena(cad1)
                  + contarVocalesCadena(cad2)
                  + contarVocalesCadena(cad3);

        System.out.println("Total de vocales: " + total);
    }

    private int contarVocalesCadena(String s) {
        int contador = 0;
        s = s.toLowerCase();

        // Recorremos solo lo necesario, usando charAt()
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = cad1;

        if (cad2.length() > mayor.length()) mayor = cad2;
        if (cad3.length() > mayor.length()) mayor = cad3;

        return mayor;
    }

    @Override
    public boolean buscarCadena(String s) {
        return cad1.equals(s) || cad2.equals(s) || cad3.equals(s);
    }
}

    