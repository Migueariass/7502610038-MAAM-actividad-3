package taller19.ejercicio3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    // Inyección de dependencias por constructor
    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void exportarReporte(String datos) {
        generadorReporte.generar(datos);
    }
}