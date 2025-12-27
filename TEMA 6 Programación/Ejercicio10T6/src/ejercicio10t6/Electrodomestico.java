/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10t6;

/**
 *
 * @author angel
 */
public class Electrodomestico implements ConsumoEnergetico{

    private float KWH;
    private float precioKWH;
    private String eficiencia;

    public Electrodomestico() {
        this.KWH = 0.0f;
        this.precioKWH = 0.0f;
        this.eficiencia = "";
    }

    public Electrodomestico(float KWH, float precioKWH, String eficiencia) {
        this.KWH = KWH;
        this.precioKWH = precioKWH;
        this.eficiencia = eficiencia;
    }

    public float getKWH() {
        return KWH;
    }

    public void setKWH(float KWH) {
        this.KWH = KWH;
    }

    public float getPrecioKWH() {
        return precioKWH;
    }

    public void setPrecoKWH(float precioKWH) {
        this.precioKWH = precioKWH;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    private float obtenerEficiencia() {
        switch (eficiencia) {
            case "A++":
                return 0.5F;
            case "A+":
                return 0.75F;
            case "A":
                return 1.0f;
            case "B":
                return 1.2f;
            default:
                return 1.0f;
        }
        
    }

    @Override
    public float calcularConsumo(float HorasUso) {
        return HorasUso * KWH * obtenerEficiencia();
    }

    @Override
    public float calcularFactura(float HorasUso) {
        return calcularConsumo(HorasUso) * precioKWH;
    }
}
