package Model;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getInfoBasica() {
        return super.getInfoBasica() +
                "\nBase: " + base +
                ", Altura: " + altura;
    }
}