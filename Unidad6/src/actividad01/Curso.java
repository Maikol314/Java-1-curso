package actividad01;

public class Curso {

	public static void main(String[] args) {
		
		Alumno alum1 = new Alumno("Miguel", "Plaza Arce", 2000, "daw1", "mañana");
		
		alum1.imprime();
		alum1.datos_alumno();
		
		Alumno alum2 = new Alumno("Pepito", "Álvarez Pérez", 1975, "Distancia", "Tarde");
		
		alum2.imprime();
		alum2.datos_alumno();
		
		Profesor prof1 = new Profesor("Jose", "Garcia Pérez", 1977, "Informática", 26);
		
		prof1.verDatosProfesor();

	}

}
