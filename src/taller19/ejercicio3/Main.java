package taller19.ejercicio3;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.exportarReporte("Ventas Semestrales 2026 - Total: $120.000.000");

        System.out.println("-----------------------------------");

        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.exportarReporte("Inventario General de Bodega - 670 ítems");
    }
}