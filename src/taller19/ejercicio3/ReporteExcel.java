package taller19.ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando hoja de cálculo en formato Excel (.xlsx) con los datos: " + datos);
    }
}