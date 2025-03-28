package Model;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Método abstracto
    public abstract double calcularArea();

    // Método para obtener información básica
    public String getInfoBasica() {
        return "Figura: " + nombre;
    }
}