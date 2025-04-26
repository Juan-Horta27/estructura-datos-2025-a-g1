package model;

public class perro extends Animal{
    private String raza;
    public perro (String nombre, int edad, double peso, String raza){
        super(nombre,edad,peso);
        this.raza=raza;
    }
    @Override
    public void hacersonido(){
        System.out.println(getNombre() + "dice guau guau");
    }
    public void jugar(){
        System.out.println(getNombre() + "esta jugando con su pelota");
    }
    public String getRaza(){return raza;}
    public void setRaza(String raza){this.raza = raza;}
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("raza:" + raza);
    }
}


