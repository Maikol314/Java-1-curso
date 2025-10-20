package actividad01;

public class Profesor extends Persona {
	
	private String dpto;
	private int NRP;
	
	Profesor(String nombre, String apellidos, int anio_nacimiento, String dpto, int NRP){
		
		super(nombre, apellidos, anio_nacimiento);
		this.dpto = dpto;
		this.NRP = NRP;
	}
	
	public void verDatosProfesor() {
        System.out.println("Datos del Profesor:");
        System.out.println("Nombre: " + getNombre() + " " + getApellidos());
        System.out.println("Año de nacimiento: " + getAnio_nacimiento());
        System.out.println("Departamento: " + dpto);
        System.out.println("NRP: " + NRP);
        
	}

}
