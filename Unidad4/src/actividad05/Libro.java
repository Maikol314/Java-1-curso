package actividad05;

public class Libro {
	
	String titulo, autor;
	int numEjemplares, numPrestados;
	
	Libro(){
		
	}
	
	Libro(String titulo, String autor, int numEjemplares){
		
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		numPrestados = 0;
	}
	
	boolean prestamo() {
		
		if (numPrestados < numEjemplares) {
			
			numPrestados++;
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	boolean devolucion() {
		
		if (numPrestados > 0) {
			
			numPrestados--;
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	void aString() {
		
		System.out.println("Información del libro");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ejemplares disponibles: " + numEjemplares);
		System.out.println("Ejemplares prestados: " + numPrestados);
	}

}
