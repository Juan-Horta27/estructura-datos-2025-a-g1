package model;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    //metodo constructor
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //metodo get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    // metodo abstracto
    public abstract void hacersonido();
    // metodo para mostrar informacion
    public void mostrarInformacion(){
        System.out.println( "nombre:" + nombre);
        System.out.println( "edad:" + edad);
        System.out.println( "peso:" + peso);
        // condicional
        if(edad<3){
            System.out.println( nombre + "es un animal joven");
        }else{
            System.out.println(nombre + "es un animal adulto");
        }
    }
}
