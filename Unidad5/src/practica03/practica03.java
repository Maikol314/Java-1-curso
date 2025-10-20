package practica03;

import java.util.Random;

public class practica03 {
	
	int vector[] = new int[20];
	
	Random random = new Random();
	
	public void rellenarArray() {
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i] = random.nextInt(101);
		}
	}
	
	public void mostrarArray() {
		
		for(int i = 0; i < vector.length; i++) {
			
			System.out.print(vector[i] + " ");
		}
	}

}
