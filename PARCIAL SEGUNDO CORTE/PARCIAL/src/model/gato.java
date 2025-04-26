package model;

public class gato extends Animal{
    private String colorPelaje;

    public gato(String nombre, int edad, double peso, String colorPelaje){
        super(nombre,edad,peso);
        this.colorPelaje=colorPelaje;
    }

    @Override
    public void hacersonido() {
        System.out.println( getNombre() + "el gato hace miau miau");
    }
    public void ronroneo(){
        System.out.println(getNombre()+ "ronroneando... prrrrrr");
    }
    public String getColorPelaje(){return colorPelaje;}
    public void setColorPelaje (String colorPelaje){ this.colorPelaje= colorPelaje;}

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" color de pelaje:" + colorPelaje);
    }
}
