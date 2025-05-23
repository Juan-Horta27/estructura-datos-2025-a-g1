package POO;

/**
 * 🐾 Clase abstracta que representa una mascotade la veterinaria.
 * Todas las mascotas heredan de esta clase.
 */
public abstract class Mascota {
    private String nombre;
    private int edad;

    // Constructor
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Método abstracto para que cada mascota haga su respectivo sonido.
    public abstract String hacerSonido();

    /**
     * Muestra la información de la mascota.
     */
    public void mostrarInfo() {
        System.out.println("🐾 Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}