package taller19.ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Autenticando al usuario '" + usuario + "' mediante token OAuth externo...");
        return credencial != null && credencial.startsWith("TOKEN_");
    }
}