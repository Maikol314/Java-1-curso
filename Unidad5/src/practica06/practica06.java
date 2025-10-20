package practica06;

import java.util.Random;

public class practica06 {
	
	int dado[] = new int[6];
	
	Random rng = new Random();
	
	public void lanzarDado(int lanzamientos) {
		
		for(int i = 0; i < lanzamientos; i++) {
			
			int resultado = rng.nextInt(1, 7);
			
			dado[resultado - 1]++;
		}
	}
	
	public void mostrarResultados() {
		
		for(int i = 0; i < dado.length; i++) {
			
			System.out.println("Cara " + (i + 1) + " ha salido " + dado[i] + " veces");
		}
	}

}
