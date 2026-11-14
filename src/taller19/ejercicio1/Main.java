package taller19.ejercicio1;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(authLocal);
        gestor1.iniciarSesion("Migueariass", "1211");

        System.out.println("-----------------------------------");

        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(authOAuth);
        gestor2.iniciarSesion("isaV@gmail.com", "TOKEN_98765");
    }
}