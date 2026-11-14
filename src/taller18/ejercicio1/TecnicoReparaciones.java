package taller18.ejercicio1;

public class TecnicoReparaciones implements Reparable {
    @Override
    public void reparar() {
        System.out.println("El técnico está realizando reparaciones en las instalaciones.");
    }
}