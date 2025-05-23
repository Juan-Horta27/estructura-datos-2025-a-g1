package Estructurado;

import java.util.Scanner;

public class mainEstructurado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estanteria biblioteca = new Estanteria();

        while (true) {
            System.out.println("\n--- Sistema de Biblioteca (Estructurado) ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> biblioteca.registrarLibro(sc);
                case 2 -> biblioteca.prestarLibro(sc);
                case 3 -> biblioteca.devolverLibro(sc);
                case 4 -> biblioteca.mostrarLibros();
                case 5 -> {
                    System.out.println("Saliendo...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}
