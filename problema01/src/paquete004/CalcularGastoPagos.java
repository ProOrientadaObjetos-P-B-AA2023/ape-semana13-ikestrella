package paquete004;

import java.util.ArrayList;

public class CalcularGastoPagos {
    public ArrayList<PagoAguaPotable> agua;
    public ArrayList<PagoLuzElectrica> luz;
    public ArrayList<PagoPredial> propiedades;
    public ArrayList<PagoTelefonoConvencional> telefono;

    public CalcularGastoPagos(ArrayList<PagoAguaPotable> agua, ArrayList<PagoLuzElectrica> luz, ArrayList<PagoPredial> propiedades, ArrayList<PagoTelefonoConvencional> telefono) {
        this.agua = agua;
        this.luz = luz;
        this.propiedades = propiedades;
        this.telefono = telefono;
    }
    public double calcularGastoPagos(){
        double gastoPagos=0;
        for(Pago pago: agua)
            gastoPagos+=pago.pago;
        for (Pago pago: luz)
            gastoPagos+=pago.pago;
        for (Pago pago: propiedades)
            gastoPagos+=pago.pago;
        for (Pago pago: telefono)
            gastoPagos+=pago.pago;
        return gastoPagos;
    }
}
