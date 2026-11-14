package taller19.ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo, String contenido) {
        almacenamiento.guardarArchivo(nombreArchivo, contenido);
    }

    public void leer(String nombreArchivo) {
        String datos = almacenamiento.recuperarArchivo(nombreArchivo);
        System.out.println("Contenido leído: " + datos);
    }
}