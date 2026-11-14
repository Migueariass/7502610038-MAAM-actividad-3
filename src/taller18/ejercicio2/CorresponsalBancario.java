package taller18.ejercicio2;

public class CorresponsalBancario implements Retirable, Pagable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en corresponsal bancario por $" + monto);
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pago en corresponsal del servicio " + servicio + " por $" + monto);
    }
}