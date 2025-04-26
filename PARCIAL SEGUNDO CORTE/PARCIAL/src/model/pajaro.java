package model;

public class pajaro extends Animal{
    private String tipoCanto;

    public pajaro(String nombre, int edad, double peso, String tipoCanto){
        super(nombre,edad,peso);
        this.tipoCanto=tipoCanto;
    }
    @Override
    public void hacersonido() {
        System.out.println( getNombre() + "canto:" + tipoCanto);
        }
        public void volar(){
            System.out.println(getNombre() + "esta volando");
        }
        public String getTipoCanto(){return tipoCanto;}
    public void setTipoCanto(String tipoCanto) {this.tipoCanto = tipoCanto;}
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("tipo canto:" + tipoCanto);
    }
}
