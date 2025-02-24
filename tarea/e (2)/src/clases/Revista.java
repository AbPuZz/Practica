package clases;

public class Revista implements Impreso {

	private int paginas;
	private String tamaño;
	private double precio;
	private String idioma;
	
	public Revista(int paginas, String tamaño, double precio, String idioma) {
		super();
		this.paginas = paginas;
		this.tamaño = tamaño;
		this.precio = precio;
		this.idioma = idioma;
	}

	@Override
	public int numeroPaginas() {
		// TODO Auto-generated method stub
		return paginas;
	}

	@Override
	public String tamañoHoja() {
		// TODO Auto-generated method stub
		return tamaño;
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public String idioma() {
		// TODO Auto-generated method stub
		return idioma;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Revista");
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Tamaño de hoja: " + tamaño);
        System.out.println("Precio: $" + precio);
        System.out.println("Idioma: " + idioma);
	}

	@Override
	public String habilidadUnica() {
		// TODO Auto-generated method stub
		return "articulos y foto de interes";
	}
	
	
}
