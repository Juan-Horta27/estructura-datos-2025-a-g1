package service;
import model.Persona;
import java.util.ArrayList;
import java.util.List;
public class Personaservice {
    private List <Persona> personas = new ArrayList<>();
    public void agregarPersona (Persona persona){
        personas.add(persona);
    }
    public void mostrarDatos(){
        for (Persona persona : personas){
            persona.mostrarDatos();
        }
    }
}
