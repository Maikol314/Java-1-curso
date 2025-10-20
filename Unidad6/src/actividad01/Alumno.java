package actividad01;

public class Alumno extends Persona {
	
	protected String grupo;
	protected String horario;
	
	public Alumno(String nombre, String apellidos, int anio_nacimiento, String grupo, String horario) {
		
		super(nombre, apellidos, anio_nacimiento);
		this.grupo = grupo;
		this.horario = horario;
	}
	
	public void grupo_turno(String grupo, String horario) {
		
		this.grupo = grupo;
		this.horario = horario;
	}
	
	void datos_alumno() {
		
		System.out.println("Datos del alumno:");
		System.out.println("Nombre: " + getNombre() + " " + getApellidos());
		System.out.println("Año de nacimiento: " + getAnio_nacimiento());
		System.out.println("Grupo: " + grupo);
		System.out.println("Horario: " + horario);
	}

}
