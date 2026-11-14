package taller18.ejercicio2;

public class CuentaBancaria implements Transferible, Retirable, Pagable {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " de la cuenta bancaria.");
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando factura de " + servicio + " por valor de $" + monto);
    }
}