/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author angel
 */
public class Ejercicio5T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== ANIMALES MAMIFEROS ============ ");
        System.out.println();
        System.out.println("========== ORNITORRINCO ============");
        Ornitorrinco orni = new Ornitorrinco ("Paco","Macho","Marron",3,5);
        System.out.println(orni.obtenerMensajeOvi());
        System.out.println(orni);
        
        orni.ponerHuevos();
        orni.ponerHuevos();
        System.out.println("Huevos ahora "+orni.mostrarNumHuevos());
        orni.incubar();
        orni.incubar();
        orni.incubar();
        System.out.println();
        
        System.out.println("========= MURCIELAGO ===========");
        Murcielago mur = new Murcielago("Luna", "Hembra", "Negro", 2, 5.0);
        System.out.println(mur.obtenerMensajeVol());
        System.out.println(mur); 
        mur.aumentoVuelo(3.5);
        mur.disminuirVuelo(1.5);
        System.out.println("Altura final "+mur.alturaVuelo());
    }
    
}
