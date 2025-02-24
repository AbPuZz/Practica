package ejercicio1;



public class Semaforo {
	private ColorSemaforo ColorActual;
	
	public Semaforo () {
		this.ColorActual = ColorSemaforo.ROJO;
	}
	public enum ColorSemaforo{
		ROJO,AMARILLO,VERDE
	}

	
	public void cambiarEstado() {
	switch(ColorActual) {
	case ROJO:
		ColorActual = ColorSemaforo.VERDE;
		System.out.println("EL COLOR ACTUAL ES VERDE AVANCE ");
		
	case VERDE:
		ColorActual = ColorSemaforo.AMARILLO;
		System.out.println("EL COLOR ACTUAL ES AMARILLO --> TOME PRECAUCION");
		
	case AMARILLO:
		ColorActual = ColorSemaforo.ROJO;
		System.out.println("ESTA EN ROJO -->NO PASAR");
	}
	
	}

	

}
