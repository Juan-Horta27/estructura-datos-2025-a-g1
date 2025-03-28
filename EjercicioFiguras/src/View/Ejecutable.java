package View;

import Model.Circulo;
import Model.Cuadrado;
import Model.Rectangulo;
import Model.Triangulo;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("=== Mostrando figuras geométricas ===");

        System.out.println("\nCírculo:");
        Circulo circulo = new Circulo("Círcunferencia", 5.0);
        System.out.println(circulo.getInfoBasica());
        System.out.println("Área: " + circulo.calcularArea());

        System.out.println("\nCuadrado:");
        Cuadrado cuadrado = new Cuadrado("Cuadrado",4.0);
        System.out.println(cuadrado.getInfoBasica());
        System.out.println("Área: " + cuadrado.calcularArea());

        System.out.println("\nRectángulo:");
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 6.0, 3.0);
        System.out.println(rectangulo.getInfoBasica());
        System.out.println("Área: " + rectangulo.calcularArea());

        System.out.println("\nTriángulo:");
        Triangulo triangulo = new Triangulo("Triángulo", 5.0, 4.0);
        System.out.println(triangulo.getInfoBasica());
        System.out.println("Área: " + triangulo.calcularArea());
    }
}