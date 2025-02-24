package ejercicio2;

public abstract class Operacion {
	protected double operando1 , operando2;

	public Operacion(double operando1, double operando2) {
		
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	public abstract double calcular();
	
	}
	


