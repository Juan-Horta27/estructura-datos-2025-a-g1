package POO;

/**
 * 🐶 Clase que representa un perro.
 * Extiende Mascota y añade atributos específicos, la cual sería raza.
 */
public class Perro extends Mascota {
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // Llama al constructor de Mascota
        this.raza = raza;
    }

    // Implementación del método abstracto (polimorfismo)
    @Override
    public String hacerSonido() {
        return "¡Guau! ¡Guau!";
    }

    // Método adicional específico de Perro
    public String getRaza() {
        return raza;
    }

    // Sobrescribe mostrarInfo para mostrar la raza
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método de Mascota
        System.out.println("🐕 Raza: " + raza + " | Sonido: " + hacerSonido());
    }
}