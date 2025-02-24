package ejercicio3;

public class ProbarSistema {

	public static void main(String[] args) {

        ControladorDispositivo controlador = new ControladorDispositivo();

        Luz luz = new Luz("Blanco");
        SistemaSonido sonido = new SistemaSonido(50);
        Termoestato termostato = new Termoestato(22);

        controlador.agregarDispositivo(luz);
        controlador.agregarDispositivo(sonido);
        controlador.agregarDispositivo(termostato);

        controlador.encenderTodos();
        controlador.mostrarEstados();

        controlador.apagarTodos();
        controlador.mostrarEstados();
    }

		
	}


