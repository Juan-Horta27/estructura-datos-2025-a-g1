package Model;

public class Resta extends Operacion {
    public Resta(double op1, double op2) {
        super(op1, op2);
    }

    @Override
    public double calcular() {
        return operando1 - operando2;
    }

    @Override
    public String getTipoOperacion() {
        return "Resta";
    }
}