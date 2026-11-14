package taller18.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparaciones();
        Limpiable limpieza = new PersonalLimpieza();

        tecnico.reparar();
        limpieza.limpiar();
    }
}