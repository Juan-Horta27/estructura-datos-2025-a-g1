package Model;

public class Multiplicacion extends Operacion {
    public Multiplicacion(double op1, double op2) {
        super(op1, op2);
    }

    @Override
    public double calcular() {
        return operando1 * operando2;
    }

    @Override
    public String getTipoOperacion() {
        return "Multiplicación";
    }
}