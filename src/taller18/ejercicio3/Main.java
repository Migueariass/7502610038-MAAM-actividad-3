package taller18.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        auto.conducir();

        System.out.println("-----------------------------------");

        Camion camion = new Camion();
        camion.cargarMercancia(4200.0);
        camion.conducir();
    }
}