package POO;

// 🎮 Clase principal para probar el sistema de mascotas.
public class mainMascotas {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();

        // Crear mascotas
        Perro perro1 = new Perro("Rocky", 3, "Labrador");
        Gato gato1 = new Gato("Copito", 2, "Blanco y negro");

        // Registrar mascotas
        vet.registrarMascota(perro1);
        vet.registrarMascota(gato1);

        // Mostrar lista
        vet.listarMascotas();

        // Ejemplo de polimorfismo
        System.out.println("\n🔊 Sonidos de las mascotas:");
        System.out.println(perro1.getNombre() + " dice: " + perro1.hacerSonido());
        System.out.println(gato1.getNombre() + " dice: " + gato1.hacerSonido());
    }
}