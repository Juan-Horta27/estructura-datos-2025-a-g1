package model;

public class empleado extends Persona {
    private int codigoEmpleado;
    private String cargoEmpleado;
    private float salarioEmpleado;
    public empleado(String nombre, int edad, String direccion, int codigoEmpleado, String cargoEmpleado, float salarioEmpleado){
        super (nombre, edad, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.salarioEmpleado = salarioEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public float getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(float salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Datos del Empleado\n");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Cargo: " + cargoEmpleado);
        System.out.println("Salario: " + salarioEmpleado);
    }
}
