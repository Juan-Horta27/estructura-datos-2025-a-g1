package Model;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getInfoBasica() {
        return super.getInfoBasica() + "\nRadio: " + radio;
    }
}