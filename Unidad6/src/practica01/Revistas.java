package practica01;

public class Revistas extends Publicaciones {
	
	private int mesPublicacion, diaPublicacion, numero;
	
	public Revistas(int codigo, int anioPublicacion, String titulo, int mesPublicacion, int diaPublicacion, int numero) {
		
		super(codigo, anioPublicacion, titulo);
		this.mesPublicacion = mesPublicacion;
		this.diaPublicacion = diaPublicacion;
		this.numero = numero;
	}
	
	public Revistas() {
		
		super();
		mesPublicacion = 0;
		diaPublicacion = 0;
		numero = 0;
	}
	
	public int getMesPublicacion() {
		
		return mesPublicacion;
	}
	
	public int getDiaPublicacion() {
		
		return diaPublicacion;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
	public void setMesPublicacion(int mesPublicacion) {
		
		this.mesPublicacion = mesPublicacion;
	}
	
	public void setDiaPublicacion(int diaPublicacion) {
		
		this.diaPublicacion = diaPublicacion;
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n- Día de publicación: " + diaPublicacion + "\n- Mes de publicación: " + mesPublicacion + "\n- Número: " + numero;
	}

}














