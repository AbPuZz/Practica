package ejercicio4;

public class TemporizadorEvento {

	public static void main(String[] args) {
		try {

			Thread.sleep(10000);
			System.out.println("esta accion tarda 10 segundos en salir");
			
			Thread.sleep(20000);
			System.out.println("esta accion tarda 20 segundos en salir");
			}catch (InterruptedException e){
			e.printStackTrace();
		}

	}

}
