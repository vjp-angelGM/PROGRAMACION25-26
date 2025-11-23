/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t5;

/**
 *
 * @author angel
 */
public class Ordenador {
    //Atributos
    
    private int memRam;
    private int capDisco;
    private String modelCPU;
    private String modelGPU;
    private double precio;
    
    public Ordenador(){
        this.memRam = 4;
        this.capDisco = 256;
        this.modelGPU = "";
        this.modelCPU= "";
    }
    
    public Ordenador(int memRam, int capDisco, String modelCPU, String modelGPU, int precio){
        this.memRam = memRam;
        this.capDisco = capDisco;
        this.modelGPU = modelGPU;
        this.modelCPU = modelCPU;
        this.precio = precio;
    }
    
    public int getMemoriaRam(){
        return memRam;
    }
    
    public void setMemoriaRam(int memRam){
        this.memRam = memRam;
    }
    
    public int getCapDisco (){
        return capDisco;
    }
    
    public void setCapDisco (int capDisco){
        this.capDisco = capDisco;
    }
    
    public String getModeloGPU(){
        return modelGPU;
    }
    
    public void setModeloGPU(String modelGPU){
        this.modelGPU = modelGPU;
    }
    
    public String getModeloCPU(){
        return modelCPU;
    }
    
    public void setModeloCPU(String modelCPU){
        this.modelCPU = modelCPU;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return ("Ordenador [RAM=%dGB, Disco=%dGB, CPU=%s, GPU=%s, Precio=%.2f€]");
    }
}
