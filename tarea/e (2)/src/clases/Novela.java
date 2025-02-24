package clases;

public class Novela extends Libros {
	private String autor;

	public Novela(int paginas, String tamaño, double precio, String idioma, String autor) {
		super(paginas, tamaño, precio, idioma);
		this.autor = autor;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		    System.out.println("Novela: " + autor);
	        System.out.println("Número de páginas: " + paginas);
	        System.out.println("Tamaño de hoja: " + tamaño);
	        System.out.println("Precio: $" + precio);
	        System.out.println("Idioma: " + idioma);	
	        }

	@Override
	public String habilidadUnica() {
		// TODO Auto-generated method stub
		return "una flipante narrativa";
	}
	


}
