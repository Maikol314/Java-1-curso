package poo;

public class Perro {
	
	// Atributos
	String nombre;
	byte edad;
	String raza;
	// Atributo estático -> Que es común para todos los objetos y no hay que hacer referencia al llamarlo
	static byte edadMayor = 9;
	
	// Constructor
	Perro (String nombre, byte edad, String raza){
		
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	Perro(){
		
		this.nombre = "Niebe";
		this.raza = "Chucho";
	}
	
	// Métodos estáticos
	static boolean esMayorDeEdad(Perro p) {
		
		if (p.edad > edadMayor) {
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	// Métodos
	void cumplirAños() {
		
		edad += 1;
	}
	
	void ladrar() {
		
		System.out.println("guau, guau");
	}
	
	void cambiarNombre(String nuevoNombre) {
		
		nombre = nuevoNombre;
	}

}
