package View;

import Model.*;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("=== Mostrando operadores ===");

        // Operandos)
        double a = 8;
        double b = 4;

        System.out.println("\nOperandos: " + a + " y " + b);

        System.out.println("\nSuma:");
        Suma suma = new Suma(a, b);
        System.out.println("Tipo: " + suma.getTipoOperacion());
        System.out.println("Resultado: " + suma.calcular());

        System.out.println("\nResta:");
        Resta resta = new Resta(a, b);
        System.out.println("Tipo: " + resta.getTipoOperacion());
        System.out.println("Resultado: " + resta.calcular());

        System.out.println("\nMultiplicación:");
        Multiplicacion multiplicacion = new Multiplicacion(a, b);
        System.out.println("Tipo: " + multiplicacion.getTipoOperacion());
        System.out.println("Resultado: " + multiplicacion.calcular());

        System.out.println("\nDivisión:");
        Division division = new Division(a, b);
        System.out.println("Tipo: " + division.getTipoOperacion());
        System.out.println("Resultado: " + division.calcular());
    }
}