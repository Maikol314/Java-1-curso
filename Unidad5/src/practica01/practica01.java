package practica01;

public class practica01 {
	
	int[] vector = {5, 4, 3, 7, 9, 12, 34, 56};
	
	public int getSumaPar() {
		
		int sumaPar = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			if (i % 2 == 0) {
				
				sumaPar += vector[i];
			}
		}
		
		return sumaPar;
	}
	
	public int getSumaImpar() {
		
	    int sumaImpar = 0;
	    
	    for (int i = 0; i < vector.length; i++) {
	    	
	        if (i % 2 != 0) {
	        	
	            sumaImpar += vector[i];
	        }
	    }
	    
	    return sumaImpar;
	}

}
