package practica01;

public class Publicaciones {
	
	private int codigo, anioPublicacion;
	private String titulo;
	
	public Publicaciones(int codigo, int anioPublicacion, String titulo) {
		
		this.codigo = codigo;
		this.anioPublicacion = anioPublicacion;
		this.titulo = titulo;
	}
	
	public Publicaciones() {
		
		codigo = 0;
		anioPublicacion = 0;
		titulo = "Sin título";
	}
	
	public int getCodigo() {
		
		return codigo;
	}
	
	public int getAnioPublicacion() {
		
		return anioPublicacion;
	}
	
	public String getTitulo() {
		
		return titulo;
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}
	
	public void setAnioPublicacion(int anioPublicacion) {
		
		this.anioPublicacion = anioPublicacion;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		
		return "Código: " + codigo + "\n- Año de publicación: " + anioPublicacion + "\n- Título: " + titulo;
	}

}
