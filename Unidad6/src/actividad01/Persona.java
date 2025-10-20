package actividad01;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int anio_nacimiento;
	
	public Persona(String nombre, String apellidos, int anio_nacimiento) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anio_nacimiento = anio_nacimiento;
	}
	
	String getNombre() {
		
		return nombre;
	}
	
	String getApellidos() {
		
		return apellidos;
	}
	
	int getAnio_nacimiento() {
		
		return anio_nacimiento;
	}
	
	void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
	}
	
	void setAnio_nacimiento(int anio_nacimiento) {
		
		this.anio_nacimiento = anio_nacimiento;
	}
	
	public void imprime() {
		
		System.out.println("Datos personales: " + nombre + " " + apellidos + " nació en el año " + anio_nacimiento);
	}

}














