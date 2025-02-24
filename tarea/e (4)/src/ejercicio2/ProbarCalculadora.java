package ejercicio2;

import java.util.List;

public class ProbarCalculadora {

	public static void main(String[] args) {
		CalculadoraSimple calculadora = new CalculadoraSimple();
		
		calculadora.agregarOperacion(new Suma(5, 3));
        calculadora.agregarOperacion(new Resta(10, 4));
        calculadora.agregarOperacion(new Multiplicacion(7, 6));
        calculadora.agregarOperacion(new Division(8, 2));
        calculadora.agregarOperacion(new Division(10, 2));
      
        
        List<Double> resultados = calculadora.calcularResultado();

        for (Double resultado : resultados) {
            System.out.println("Resultado: " + resultado);
        }

	}

}
