package practica05;

import java.util.Random;

public class practica05 {
	
	int cara = 0;
	int cruz = 0;
	
	int caras[] = new int[10];
	
	Random random = new Random();
	
	public void lanzarMoneda() {
		
		for(int i = 0; i < caras.length; i++) {
			
			caras[i] = random.nextInt(2);
			
			if(caras[i] == 0) {
				
				cruz++;
			}
			
			else {
				
				cara++;
			}
		}
	}
	
	public void mostrar() {
		
		System.out.print("Resultado: [");
		
		for(int i = 0; i < caras.length; i++) {
			
			if(caras[i] == 0) {
				
				System.out.print("Cruz" + " ");
			}
			
			else {
				
				System.out.print("Cara" + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Caras: " + cara);
		System.out.println("Cruz: " + cruz);
	}

}
