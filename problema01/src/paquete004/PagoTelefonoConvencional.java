/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago{

    double tarifa;
    double minutosConsumidos;
    double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public void calcularPago(){
        pago = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "tarifa=" + tarifa +
                ", minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto + super.toString()+
                '}';
    }
}
