package clases;

public class Cuaderno implements Impreso {
	
	private int paginas;
	private String tamaño;
	private double precio;
	private String idioma;
	
	
	

	public Cuaderno(int paginas, String tamaño, double precio, String idioma) {
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
	public  void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println( "agenda");
		System.out.println("numero de paginas " + paginas  );
		System.out.println( "tamaño de hojas : " + tamaño);
		System.out.println( "precio : € " + precio);
		System.out.println( "idioma " + idioma);
	}




	@Override
	public String habilidadUnica() {
		// TODO Auto-generated method stub
		return "ideal para escribir " ;
	}
	


}
