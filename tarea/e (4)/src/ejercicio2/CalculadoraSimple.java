package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimple implements Calculadora {
	 private List<Operacion> operaciones;

	 public CalculadoraSimple() {
	        this.operaciones = new ArrayList<>();
	    }
	@Override
	public void agregarOperacion(Operacion operacion) {
		// TODO Auto-generated method stub
		operaciones.add(operacion);
	}

	@Override
	public List<Double> calcularResultado() {
		List<Double>resultado = new ArrayList<>();
		for (Operacion operacion : operaciones) {
			resultado.add(operacion.calcular());
		}
		return resultado;
	}


}
