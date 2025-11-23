/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t5;

/**
 *
 * @author angel
 */
public class Servidor extends Ordenador {

    private double tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    public Servidor(int pedirRam, int pedirDisco, double pedirPrecio, double pedirTamanoMonitor, String pedirRaton) {
        super();
        this.tamanoMonitor = 15.6;
        this.modeloRaton = "";
        this.modeloTeclado = "";
    }

    public Servidor(int memRam, int capDisco, String modelGPU, String modelCPU, double precio,
            double tamanoMonitor, String modeloTeclado, String modeloRaton) {
        super();
        this.modeloRaton = modeloRaton;
        this.modeloTeclado = modeloTeclado;
        this.tamanoMonitor = tamanoMonitor;
    }
    
    public double getTamanoMonitor(){
        return tamanoMonitor;
    }
    
    public void setTamanoMonitor(double tamanoMonitor){
        this.tamanoMonitor = tamanoMonitor;
    }
    
    public String getModeloTeclado(){
        return modeloTeclado;
    }
    
    public void setModeloTeclado(String modeloTeclado){
        this.modeloTeclado = modeloTeclado;
    }
    
    public String getModeloRaton(){
        return modeloRaton;
    }
    
    public void setModeloRaton(String modeloRaton){
        this.modeloRaton = modeloRaton;
    }
    @Override
    public String toString(){
        return "Este servidor tiene "+this.modeloRaton+" modelo de raton "+
                " un modelo de teclado "+this.modeloTeclado+" y un tamaño de monitor de "+
                this.tamanoMonitor+" pulgadas";
    }
    
}
