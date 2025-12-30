/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio11t6;

/**
 *
 * @author angel
 */
public interface Pagable {
    float pagoTarjeta();
    float pagoEfectivo();
    float pagoPaypal();
    void procesarPago();
}
