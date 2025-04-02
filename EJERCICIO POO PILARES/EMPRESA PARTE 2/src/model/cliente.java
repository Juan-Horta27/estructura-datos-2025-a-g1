package model;

public class cliente extends Persona {
    private int numeroCliente;
    private String historialCompras;

    public cliente(String nombre, int edad, String direccion, int numeroCliente, String historialCompras){
        super(nombre, edad, direccion);
        this.numeroCliente=numeroCliente;
        this.historialCompras=historialCompras;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Datos del Cliente\n");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Número de Cliente: " + numeroCliente);
        System.out.println("Historial de Compras: " + historialCompras);
    }
}
