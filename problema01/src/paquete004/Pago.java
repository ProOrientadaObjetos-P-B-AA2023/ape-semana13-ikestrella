package paquete004;

import paquete002.Ciudad;

public abstract class Pago {
    double pago;
    public abstract void calcularPago();

    @Override
    public String toString() {
        return "Pago{" +
                "pago=" + pago +
                '}';
    }
}
