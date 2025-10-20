package poo;

public class AppPerro {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("Laika", (byte)2, "Chucho");
		Perro p2 = new Perro();
		
		p1.nombre = "Pepín";
		p1.edad = 2;
		p1.raza = "Chucho";
		
		System.out.println("Edad actual: " + p1.edad + " años");
		
		p1.cumplirAños();
		
		System.out.println("Edad tras cumplir un año: " + p1.edad + " años");
		
		p1.cambiarNombre("Manolín");
		
		System.out.println("El nuevo nombre es " + p1.nombre);
		
		for(int i = 0; i < 5; i++) {
			
			p1.ladrar();
		}
		
		p2.nombre = "Laika";
		
	}

}
