package Model;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau miau miauuuuu!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: Maine Coon");
    }
}