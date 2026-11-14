package taller19.ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    // Inyección de dependencias por constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicioAutenticacion.autenticar(usuario, credencial)) {
            System.out.println("Acceso concedido para: " + usuario);
        } else {
            System.out.println("Acceso denegado para: " + usuario);
        }
    }
}