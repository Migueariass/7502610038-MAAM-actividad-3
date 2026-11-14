package taller19.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.guardar("contrato.pdf", "Cláusulas del servicio...");
        gestorLocal.leer("contrato.pdf");

        System.out.println("-----------------------------------");

        Almacenamiento nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.guardar("respaldo_bd.sql", "CREATE TABLE usuarios...");
        gestorNube.leer("respaldo_bd.sql");
    }
}