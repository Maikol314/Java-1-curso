package actividad06;

public class Gestor {
	
	String nombre; 
	private String telefono;
	double importeMax;
	
	Gestor(String nombre, String telefono, double importeMax){
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}
	
	Gestor(String nombre, String telefono){
		
		this(nombre, telefono, 10000);
	}
	
	public String getTelefono() {
		
		return telefono;
	}

}
