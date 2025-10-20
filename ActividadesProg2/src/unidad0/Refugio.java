package unidad0;

import java.util.ArrayList;

public class Refugio {
	
	private ArrayList<Animal> animales;
	
	public Refugio() {
		
		animales = new ArrayList<>();
	}
	
	public void agregarAnimal(Animal a) {
		
		animales.add(a);
	}
	
	public void mostrarAnimales() {
		
		System.out.println("Animales en el refugio:");
		
		for(Animal a : animales) {
			
			System.out.println(a.toString());
		}
	}
	
	public void hacerSonidos() {
		
		System.out.println("Sonidos de los animales:");
		
		for(Animal a : animales) {
			
			a.hacerSonido();
		}
	}

}





