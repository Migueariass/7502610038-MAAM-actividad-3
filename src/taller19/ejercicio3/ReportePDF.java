package taller19.ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato PDF con los datos: " + datos);
    }
}