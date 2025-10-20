package practica01;

public class Libros extends Publicaciones {
	
	private String autor;
	private boolean prestado;
	
	public Libros(int codigo, int anioPublicacion, String titulo, String autor) {
		
		super(codigo, anioPublicacion, titulo);
		this.autor = autor;
		prestado = false;
	}
	
	public Libros() {
		
		super();
		autor = "Desconocido";
		prestado = false;
	}
	
	public String getAutor() {
		
		return autor;
	}
	
	public boolean getPrestado() {
		
		return prestado;
	}
	
	public void setAutor(String autor) {
		
		this.autor = autor;
	}
	
	public void setPrestado(boolean prestado) {
		
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +  "\n- Autor: " + autor + "\n- Prestado: " + prestado;
	}

}
