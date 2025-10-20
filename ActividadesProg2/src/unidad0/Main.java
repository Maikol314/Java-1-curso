package unidad0;

public class Main {

	public static void main(String[] args) {
		
		Refugio refugio = new Refugio();
		
		Perro perro1 = new Perro("Toby", 7, 15.5, "Golden");
		Perro perro2 = new Perro("Tedy", 8, 20.3, "Husky");
		
		Gato gato1 = new Gato("Casper", 2, 5, "Gris");
		Gato gato2 = new Gato("Oreo", 4, 3.6, "Blanco");
		
		Pajaro pajaro1 = new Pajaro("Piolin", 1, 0.7, false);
		Pajaro pajaro2 = new Pajaro("Kiko", 2, 0.4, true);
		
		refugio.agregarAnimal(perro1);
        refugio.agregarAnimal(perro2);
        refugio.agregarAnimal(gato1);
        refugio.agregarAnimal(gato2);
        refugio.agregarAnimal(pajaro1);
        refugio.agregarAnimal(pajaro2);
        
        refugio.mostrarAnimales();
        
        System.out.println("");
        
        refugio.hacerSonidos();

	}

}
