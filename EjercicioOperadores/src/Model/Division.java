package Model;

public class Division extends Operacion {
    public Division(double op1, double op2) {
        super(op1, op2);
    }

    @Override
    public double calcular() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return operando1 / operando2;
    }

    @Override
    public String getTipoOperacion() {
        return "División";
    }
}