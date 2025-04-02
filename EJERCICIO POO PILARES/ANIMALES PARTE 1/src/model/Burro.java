package model;

import static java.lang.System.*;

public class Burro extends Animal{
    private String colorPelaje;

    public Burro(String nombre, int edad, float peso, String colorPelaje){
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    public String getcolorPelaje(){
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje){
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void comer(){
        System.out.println("Soy un burro y estoy comiendo pasto.");
    }

    @Override
    public void dormir(){
        out.println("Estoy durmiendo bajo un arbol");
    }

    @Override
    public void desplazarse(){
        out.println("Estoy caminando lentamente");
    }
}
