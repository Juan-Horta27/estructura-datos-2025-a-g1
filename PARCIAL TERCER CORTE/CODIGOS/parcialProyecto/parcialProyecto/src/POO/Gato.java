package POO;

/**
 * 🐱 Clase que representa un gato.
 * Extiende Mascota y añade atributos específicos. Es decir, color.
 */
public class Gato extends Mascota {
    private String color;

    // Constructor
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);  // Llama al constructor de Mascota
        this.color = color;
    }

    // Implementación del método abstracto (polimorfismo)
    @Override
    public String hacerSonido() {
        return "¡Miau! ¡Miau!";
    }

    // Método adicional específico de Gato
    public String getColor() {
        return color;
    }

    // Sobrescribe mostrarInfo para mostrar color
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método de Mascota
        System.out.println("🐈 Color: " + color + " | Sonido: " + hacerSonido());
    }
}