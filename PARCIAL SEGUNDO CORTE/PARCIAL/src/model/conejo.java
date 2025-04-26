package model;

public class conejo extends Animal{
    private double longitudOrejas;

    public conejo(String nombre, int edad, double peso, double longitudOrejas){
        super(nombre,edad,peso);
        this.longitudOrejas = longitudOrejas;
    }
    @Override
    public void hacersonido() {
        System.out.println(getNombre() + "hace sniff sniff");
    }
    public void saltar() {
        System.out.println(getNombre() + "esta saltando con sus orejas de:" +longitudOrejas + "cm");
    }
    public double getLongitudOrejas(){return longitudOrejas;}
    public void setLongitudOrejas(double longitudOrejas){this.longitudOrejas = longitudOrejas;}
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("longitud de orejas:" + longitudOrejas);
    }
}
