package actividad04;

public class Titular {
	
	private String nombre, apellidos;
	private int edad;
	
	public Titular(String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	String getNombre() {
		
		return nombre;
	}
	
	String getApellidos() {
		
		return apellidos;
	}
	
	@Override
	public String toString() {
		
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}

}
