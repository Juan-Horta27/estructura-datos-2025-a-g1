package main;

import model.empleado;
import model.cliente;
import service.Personaservice;

public class main {
    public static void main(String[] args) {
        Personaservice service = new Personaservice();
        service.agregarPersona(new cliente("Horta", 18, "Calle 45 #4-5", 97289, "Papa. arracacha, zanahoria"));
        service.agregarPersona(new empleado("Esteban", 19, "Calle 26 #12-7", 1000, "Jefe", 100));
        service.mostrarDatos();
    }
}
