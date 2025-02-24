package ejercicio3;

public class Luz extends DispositivoBase {
	 private String color;

	    public Luz(String color) {
	        super();
	        this.color = color;
	    }

	    @Override
	    public void encender() {
	        super.encender();
	        System.out.println("Color de luz: " + color);
	    }

}
