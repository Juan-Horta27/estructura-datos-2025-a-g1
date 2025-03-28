package Model;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo abstracto
    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println(nombre);
    }
}