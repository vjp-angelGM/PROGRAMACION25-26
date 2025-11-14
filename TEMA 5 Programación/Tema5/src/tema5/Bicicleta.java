/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author angel
 */
public class Bicicleta {

    //ATRIBUTOS
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    //Atributo estático que pertenece a la clase
    private static int numBicis=0;
    
    //ATRIBUTO DE OTRA CLASE (Composicion de clases)
   
    //CONSTRUCTORES
    //Por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        //Incrementamos el valor del atributo estático
        IncrementarBicis();
    }

    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
        this.manillar = manillar;
        this.ruedas = ruedas;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        //Incrementamos el valor del atributo estático
        IncrementarBicis();
    }

    //GETTER Y SETTER 
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void getPedales(String pedales) {
        this.pedales = pedales;
    }

    public String setPedales() {
        return this.pedales;
    }

    public void getFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String setFrenos() {
        return this.frenos;
    }
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }

    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
    public int getNumBicis(){
        return this.numBicis;
    }
    //PASO DE PARAMETRO POR REFERENCIA

   
    
    //TO STRING 
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.pedales
                + ", un manillar " + this.manillar
                + " , unos pedales " + this.pedales
                + ", unas ruedas " + this.ruedas
                + ", unos frenos " + this.frenos
                + " y ahora ¿estoy pedaleando? " + this.estaPedaleando;
    }

    //METODOS
    private void acelerar() {
        System.out.println("Acelerando......");
    }
   private static void IncrementarBicis(){
        numBicis++;
    }
   
}
