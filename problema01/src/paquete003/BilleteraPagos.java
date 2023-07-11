/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes;


    public ArrayList<PagoAguaPotable> agua;
    public ArrayList<PagoLuzElectrica> luz;
    public ArrayList<PagoPredial> propiedades;
    public ArrayList<PagoTelefonoConvencional> telefono;

    public BilleteraPagos() {}

    public BilleteraPagos(Persona persona, String mes, ArrayList<PagoAguaPotable> agua, ArrayList<PagoLuzElectrica> luz, ArrayList<PagoPredial> propiedades, ArrayList<PagoTelefonoConvencional> telefono,double gastoPagos) {
        this.persona = persona;
        this.mes = mes;
        this.agua = agua;
        this.luz = luz;
        this.propiedades = propiedades;
        this.telefono = telefono;
        this.gastoPagos=gastoPagos;
    }

    @Override
    public String toString() {
        return "Presentar Reporte"+"BilleteraPagos{" +
                "\npersona=" + persona +
                ", \ngastoPagos=" + gastoPagos +
                ", \nmes='" + mes + '\'' +
                ", \nagua=" + agua +
                ", \nluz=" + luz +
                ", \npropiedades=" + propiedades +
                ", \ntelefono=" + telefono +
                '}';
    }
}
