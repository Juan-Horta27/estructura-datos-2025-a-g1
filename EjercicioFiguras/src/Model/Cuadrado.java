package Model;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String getInfoBasica() {
        return super.getInfoBasica() + "\nLado: " + lado;
    }
}