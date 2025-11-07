/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author angel
 */
public class Coche {
    // ATRIBUTOS : Características NUNCA SE INICIALIZAN AQUI
   private String ruedas;
   private String suspension;
   private int espejos;
   
   // CONSTRUCTORES : Permiten "construir" un objeto de este tipo e inicializan todos los atributos
   //CONSTRUCTOR POR DEFECTO
   public Coche(){
       this.ruedas=""; // Al ser String se inicializa con comilla
       this.suspension="";
       this.espejos = 0; // Al ser int se inicializa a 0
   }      
     //CONSTRUCTOR PARAMETRIZADO sobrecarga de métodos y autorreferencia this

    /**
     *
     * @param ruedas
     * @param suspension
     * @param espejos
     */
    public Coche(String ruedas, String suspension, int espejos){
         this.ruedas = ruedas;
         this.suspension = suspension;
         this.espejos = espejos;
     }
    
    //GETTERS Y SETTERS 
       public String getRuedas(){
           return this.ruedas;
       }
       
       public void setRuedas(String ruedas){
           this.ruedas = ruedas;
       }
       public String getSuspension(){
           return this.suspension;
       }
       
       public void setSuspension(String suspension){
           this.suspension = suspension;
       }
       
       public int getEspejos(){
           return this.espejos;
       }
       
       public void setEspejos(int espejos){
           this.espejos = espejos;
       }
       
       //TO STRING DEVOLVER UN STRING CON LOS DATOS DEL OBJETO
       public String toString(){
           return "Mi coche tiene ruedas "+this.ruedas+ ", suspensión "+this.suspension+" y "+this.espejos+" espejos";
       }
       //OTROS MÉTODOS (OPCIONAL)
       public void acelerar(){
           System.out.println("Acelerando coche.......");
       }
       
       public void frenar(){
           System.out.println("Frenando coche.......");
       }
       
       public void girar(){
           System.out.println("Girando......");
       }
   }
   

