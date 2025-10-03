/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

import javax.swing.JOptionPane;

/**
 *
 * @author PACKARD BELL
 */
public class horas {
public static void main(String [] args){
int segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los segundos a convertir"));
int horas = segundos * 3600;
int minutos = (segundos - horas * 3600)/60;
int segundosR = segundos - horas*3600 - minutos*60;
JOptionPane.showMessageDialog(null, segundos+ " segundos equivalen a "+horas+" horas con "+segundos+" minutos y "+segundos+" segundos. ");
   
   
   
    }
    
}
