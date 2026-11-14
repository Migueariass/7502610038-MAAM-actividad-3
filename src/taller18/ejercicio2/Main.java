package taller18.ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.transferir(200000, "987-654321-00");
        cuenta.retirar(50000);
        cuenta.pagarFactura("Internet", 95000);

        System.out.println("-----------------------------------");

        CorresponsalBancario corresponsal = new CorresponsalBancario();
        corresponsal.retirar(30000);
        corresponsal.pagarFactura("Agua", 45000);
    }
}