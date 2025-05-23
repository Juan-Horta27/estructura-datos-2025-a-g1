package Estructurado;

import java.util.HashMap;
import java.util.Scanner;

public class Estanteria {
    private HashMap<Integer, String> libros = new HashMap<>();
    private HashMap<Integer, Boolean> disponibles = new HashMap<>();
    private HashMap<String, Integer> estanteria = new HashMap<>(); // "fila-col" -> ID
    private HashMap<Integer, String> ubicaciones = new HashMap<>(); // ID -> "fila-col"

    public void registrarLibro(Scanner sc) {
        System.out.print("ID del libro: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (libros.containsKey(id)) {
            System.out.println("Error: ID ya registrado");
            return;
        }

        System.out.print("Título: ");
        String titulo = sc.nextLine();
        libros.put(id, titulo);
        disponibles.put(id, true);

        boolean ubicado = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String key = i + "-" + j;
                if (!estanteria.containsKey(key)) {
                    estanteria.put(key, id);
                    ubicaciones.put(id, key);
                    ubicado = true;
                    break;
                }
            }
            if (ubicado) break;
        }

        if (!ubicado) {
            System.out.println("Estantería llena. Libro no registrado.");
            libros.remove(id);
            disponibles.remove(id);
        } else {
            System.out.println("Libro registrado exitosamente");
        }
    }

    public void prestarLibro(Scanner sc) {
        System.out.print("ID del libro: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!libros.containsKey(id)) {
            System.out.println("Error: Libro no encontrado");
            return;
        }

        if (disponibles.get(id)) {
            disponibles.put(id, false);
            System.out.println("Libro prestado");
        } else {
            System.out.println("Libro no disponible");
        }
    }

    public void devolverLibro(Scanner sc) {
        System.out.print("ID del libro: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!libros.containsKey(id)) {
            System.out.println("Error: Libro no encontrado");
            return;
        }

        disponibles.put(id, true);
        System.out.println("Libro devuelto");
    }

    public void mostrarLibros() {
        System.out.println("\n--- Listado de Libros ---");
        for (int id : libros.keySet()) {
            String titulo = libros.get(id);
            boolean disp = disponibles.get(id);
            String ubic = ubicaciones.get(id);
            System.out.printf("ID: %d | Título: %s | Disponible: %s | Ubicación: %s%n",
                    id, titulo, disp ? "Sí" : "No", ubic);
        }
    }
}