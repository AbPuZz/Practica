package ejercicio2;

public class Resta extends Operacion {
	public Resta (double operando1, double operando2) {
		super(operando1,operando2);
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return operando1 - operando2;
	}

}
