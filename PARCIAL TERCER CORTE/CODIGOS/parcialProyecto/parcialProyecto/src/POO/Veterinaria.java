package POO;

import java.util.ArrayList;
import java.util.List;

/**
 * 🏥 Clase que simula una veterinaria.
 * Permite registrar mascotas y listarlas.
 */
public class Veterinaria {
    private List<Mascota> mascotas = new ArrayList<>();

    // Registra una nueva mascota.
    public void registrarMascota(Mascota mascota) {
        mascotas.add(mascota);
        System.out.println("✅ " + mascota.getNombre() + " registrado/a.");
    }

    // Muestra todas las mascotas registradas.
    public void listarMascotas() {
        System.out.println("\n📜 Lista de Mascotas:");
        for (Mascota mascota : mascotas) {
            mascota.mostrarInfo();  // Polimorfismo
            System.out.println("-----");
        }
    }
}