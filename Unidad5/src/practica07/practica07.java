package practica07;

import java.util.Random;

public class practica07 {
	
	int array[] = new int[15];
	
	Random rng = new Random();
	
	public void rellenarArray() {
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = rng.nextInt(1, 101);
		}
	}
	
	public void borrarElemento(int indice) {
		
		if (indice < 0 || indice >= array.length) {
			
			System.out.println("Índice fuera de rango.");
		}
		
		else {
			
			for(int i = indice; i < array.length; i++) {
				
				array[i] = array[i + 1];
			}
			
			array[array.length - 1] = 0;
		}
		
	}

}
