package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ControladorDispositivo {
	private List<Dispositivo>dispositivos;
	
	


	public ControladorDispositivo() {
		dispositivos = new ArrayList<>();
	}
	
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void encenderTodos() {
        for (Dispositivo d : dispositivos) {
            d.encender();
        }
    }

    public void apagarTodos() {
        for (Dispositivo d : dispositivos) {
            d.apagar();
        }
    }

    public void mostrarEstados() {
        for (Dispositivo d : dispositivos) {
            System.out.println(d.getClass().getSimpleName() + ": " + d.obternerEstado());
        }
    }


}
