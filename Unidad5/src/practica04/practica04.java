package practica04;

public class practica04 {
	
	int vector[] = {4, 6, 23, 2, 65, 76, 7, 32, 19, 90};
	
	public int mostrar(int posicion) {
		
		for(int i = 0; i < vector.length; i++) {
			
			if(posicion == i) {
				
				return vector[i];
			}
		}
		
		return Integer.MAX_VALUE;
	}

}
