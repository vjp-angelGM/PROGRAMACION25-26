/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;

/**
 *
 * @author agarciam01
 */
public class Tiempo {
    final static int SEGUNDOSH = 3600;
    final static int SEGUNDOSM = 60;
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        int tiempo = 10000, h, m,s;
        
        h = tiempo /3600;
        m = tiempo /60;
        s = tiempo % 60;
        
        System.out.println("Horas: "+h);
        System.out.println("Minutos: "+m);
        System.out.println("Segundos:"+s);
    }*/
    public static void main(String[] args){
       //Tiempo en segundos 
       int tiempo = 10000;
       
       //Calculo horas
       int horas = tiempo / 3600;
       
       //Calculo de los minutos 
       int minutos = (tiempo % SEGUNDOSH) / SEGUNDOSM;
       
       //Calculo de los segundos despues de haber sacado horas y minutos
       int segundos = tiempo % SEGUNDOSM;
       
        System.out.println(tiempo +" segundos hacen un total de: "+horas+" horas "+minutos+" minutos "+segundos+" segundos.");
    }
}
