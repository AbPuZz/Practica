package ejercicio3;

public class Termoestato extends DispositivoBase {
	private int temperatura;

	public Termoestato(int temperatura) {
		super();
		this.temperatura = temperatura;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		super.encender();
		System.out.println("temperatura a "+ temperatura + "ºC");
	}
	

}
