package Model;

public abstract class Operacion {
    protected double operando1;
    protected double operando2;

    public Operacion(double op1, double op2) {
        this.operando1 = op1;
        this.operando2 = op2;
    }

    //Metodo abstracto
    public abstract double calcular();

    public String getTipoOperacion() {
        return "Operación básica";
    }
}