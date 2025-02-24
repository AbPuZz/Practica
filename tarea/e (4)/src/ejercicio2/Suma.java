package ejercicio2;

public class Suma extends Operacion {
	public Suma (double operando1, double operando2) {
		super(operando1,operando2);
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return operando1 + operando2;
	}

}
