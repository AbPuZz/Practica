package clases;

public class Main {
	public static void main (String[]args) {
		Impreso cuadreno = new Cuaderno(100,"A5", 9, "frances");
		Impreso agenda = new Agenda(200,"A4",20,"español");
		Impreso revista = new Revista(50, "A4", 4.99, "Inglés");
		 
		   Impreso novela = new Novela(350, "A5", 15.99, "Español", "Gabriel García Márquez");
	       Impreso libroColorear = new LibroColorear(30, "A4", 9.99, "Español", "Animales");
	       Impreso cuentos = new Cuentos(60, "A5", 7.99, "Español", "Jorge Luis Borges");
	
	        
	
	
	
	 cuadreno.mostrarDatos();
     System.out.println("Habilidad única: " + cuadreno.habilidadUnica());
     System.out.println();

     agenda.mostrarDatos();
     System.out.println("Habilidad única: " + agenda.habilidadUnica());
     System.out.println();

     revista.mostrarDatos();
     System.out.println("Habilidad única: " + revista.habilidadUnica());
     System.out.println();

     novela.mostrarDatos();
     System.out.println("Habilidad única: " + novela.habilidadUnica());
     System.out.println();

     libroColorear.mostrarDatos();
     System.out.println("Habilidad única: " + libroColorear.habilidadUnica());
     System.out.println();

     cuentos.mostrarDatos();
     System.out.println("Habilidad única: " + cuentos.habilidadUnica());}
	

}