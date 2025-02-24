package clases;

public abstract class Libros implements Impreso{
protected int paginas;
protected String tamaño;
protected double precio;
protected String idioma;

public Libros(int paginas, String tamaño, double precio, String idioma) {
	
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
public abstract String habilidadUnica();





}
