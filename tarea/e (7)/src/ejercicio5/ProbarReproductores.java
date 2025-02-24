package ejercicio5;

public class ProbarReproductores {

	public static void main(String[] args) {
		Reproductor reproductorAudio = new ReproductoraAudio();
		Reproductor reproducirvideo = new ReproducirVideo();
		
		System.out.println("probamos reproductor audio ");
		reproductorAudio.reproducir();
		reproductorAudio.pausar();
		reproductorAudio.rebobinar();
		reproductorAudio.detener();
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("proba,os reproductor video");
		reproducirvideo.reproducir();
		reproducirvideo.pausar();
		reproducirvideo.rebobinar();
		reproducirvideo.detener();
		
	}

}
