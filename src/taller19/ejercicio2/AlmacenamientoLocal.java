package taller19.ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en el disco duro local. Contenido: " + contenido);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando '" + nombreArchivo + "' desde el disco duro local.");
        return "Datos locales de " + nombreArchivo;
    }
}