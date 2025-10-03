/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobanco;

/**
 *
 * @author angel
 */
public class EjercicioBanco {
    private final static int DINERO = 2000;
    private final static float INTERES_ANYO = 2.75F;
    private final static float RETENCION = 0.18F;
    private final static int MESES = 6;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. CALCULAMOS LOS INTERESES AL AÑO
        float interesAnyo = DINERO * (INTERES_ANYO / 100);
        
        //2. CALCULAMOS LOS INTERESES PARA 6 MESES
        float interesMedioAnyo = interesAnyo * (MESES / 12);
        
        //3. APLICAR RETENCIÓN
        float mesesNetos = interesMedioAnyo * ( 1 - RETENCION);
        
        //4. MOSTRAR POR PANTALLA TODO
        System.out.println(DINERO * INTERES_ANYO/100/2 * (1 - RETENCION));
    }
    
}
