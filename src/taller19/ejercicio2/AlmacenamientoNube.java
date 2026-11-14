package taller19.ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Subiendo '" + nombreArchivo + "' al servidor en la nube. Contenido: " + contenido);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Descargando '" + nombreArchivo + "' desde la nube.");
        return "Datos en la nube de " + nombreArchivo;
    }
}