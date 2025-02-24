package clases;

public class Agenda implements Impreso {
	
	private int paginas;
	private String tamaño;
	private double precio;
	private String idioma;
	

	

	public Agenda(int paginas, String tamaño, double precio, String idioma) {
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
		
	}




	@Override
	public String habilidadUnica() {
		// TODO Auto-generated method stub
		return "ideal para no olvidarse nada ";
	}




	public int getPaginas() {
		return paginas;
	}




	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}




	public String getTamaño() {
		return tamaño;
	}




	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public String getIdioma() {
		return idioma;
	}




	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	
}
