package View;

import Model.*;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("=== Mostrando animales ===");

        Perro perro = new Perro("");
        Gato gato = new Gato("");
        Pajaro pajaro = new Pajaro("");

        System.out.println("\nMostrando perro:");
        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println("\nMostrando gato:");
        gato.mostrarInfo();
        gato.hacerSonido();

        System.out.println("\nMostrando pájaro:");
        pajaro.mostrarInfo();
        pajaro.hacerSonido();
    }
}