package ejercicio5;

public class ReproducirVideo implements Reproductor {

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("reproduciendo video");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("video pausado");
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("video detenido");
	}

	@Override
	public void rebobinar() {
		// TODO Auto-generated method stub
		System.out.println("rebobinando video");
	}

}
