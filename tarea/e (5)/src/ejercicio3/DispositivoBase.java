package ejercicio3;

public abstract class DispositivoBase implements Dispositivo {
	protected boolean encendido;
	
	public  DispositivoBase() {
		this.encendido = false;
		
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		encendido = true;
		System.out.println(getClass().getSimpleName() + "ENCENDIDO");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		encendido= false;
		System.out.println(getClass().getSimpleName() + "apagado");
	}

	@Override
	public String obternerEstado() {
		// TODO Auto-generated method stub
		return encendido? " encednido " : " apagado";
	}
	
	

}
