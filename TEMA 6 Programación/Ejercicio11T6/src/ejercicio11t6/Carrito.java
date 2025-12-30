/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t6;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Carrito implements Descontable, Pagable {

    private float total;
    private double descuentoAplicado;
    private String metodoPago;

    public Carrito(float precioFinal) {
        super();
        this.total = precioFinal;
        this.descuentoAplicado = 0;
        this.metodoPago = "";
    }

    public Carrito(float total, double descuentoAplicado, String metodoPago) {
        super();
        this.total = total;
        this.metodoPago = metodoPago;
        this.descuentoAplicado = descuentoAplicado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public float pagoTarjeta() {
        return this.total + 5;
    }

    @Override
    public float pagoEfectivo() {
        return this.total;
    }

    @Override
    public float pagoPaypal() {
        return this.total * 1.03f;
    }

    @Override
    public void procesarPago() {
        Scanner sc = new Scanner(System.in); 
        if (this.total > 50) {
            aplicarDescuento(0.10f);
            System.out.println("Descuento del 10% aplicado por compra superior a 50€.");
        }

        System.out.println("Total actual: " + this.total + "€. Seleccione método: 1-Tarjeta, 2-Efectivo, 3-Paypal");
        int opcion = sc.nextInt(); 
        switch (opcion) {
            case 1:
                System.out.println("Cobro con tarjeta (comisión 5€): " + pagoTarjeta() + "€");
                break;
            case 2 :
                System.out.println("Cobro en efectivo: " + pagoEfectivo() + "€");
                break;
            case 3 :
                System.out.println("Cobro con Paypal (comisión 3%): " + pagoPaypal() + "€");
                break;
            default :
                System.out.println("Opción no válida.");
        }
    }

    @Override
    public void aplicarDescuento(float descuento) {
        this.total = this.total - (this.total * descuento);
    }
}
