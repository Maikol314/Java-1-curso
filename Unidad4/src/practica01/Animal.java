package practica01;

public class Animal {
	
	private String nombre;
	private int edad;
	
	public void animal() {
		
		edad = 0;
	}
	
	public void nace() {
		
		System.out.print("Hola, he nacido");
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}

}
