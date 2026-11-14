package taller19.ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Autenticando al usuario '" + usuario + "' en la base de datos local...");
        return "1234".equals(credencial);
    }
}