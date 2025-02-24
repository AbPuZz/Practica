package clases;

public class LibroColorear extends Libros {
private String tema;

public LibroColorear(int paginas, String tamaño, double precio, String idioma, String tema) {
	super(paginas, tamaño, precio, idioma);
	this.tema = tema;
}

@Override
public void mostrarDatos() {
	// TODO Auto-generated method stub
	 System.out.println("Libro para Colorear: " + tema);
     System.out.println("Número de páginas: " + paginas);
     System.out.println("Tamaño de hoja: " + tamaño);
     System.out.println("Precio: $" + precio);
     System.out.println("Idioma: " + idioma);
}

@Override
public String habilidadUnica() {
	// TODO Auto-generated method stub
	return "ayuda a mejorar la creatividad";
}



}
