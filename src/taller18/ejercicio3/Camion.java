package taller18.ejercicio3;

public class Camion implements Conducible, TransportadorCarga {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión de carga por la autopista.");
    }

    @Override
    public void cargarMercancia(double pesoKg) {
        System.out.println("Cargando " + pesoKg + " kg de mercancía en el camión.");
    }
}