package ejercicio3;

public class SistemaSonido extends DispositivoBase {
	private int volumen ;

	public SistemaSonido(int volumen) {
		super();
		this.volumen = volumen;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		super.encender();
		System.out.println("volumen : " + volumen);
	}
	
	

}
