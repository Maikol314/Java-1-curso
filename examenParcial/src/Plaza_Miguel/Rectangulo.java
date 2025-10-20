package Plaza_Miguel;

public class Rectangulo {
	// Ã�rea de datos
	private int base;
	private int altura;
	
	// Constructor
	public Rectangulo (int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public void dibujaConFor() {
		/* Utilizando Ãºnicamente como estructura
		 * repetitiva el for, dar soluciÃ³n a lo solicitado
		 * Para mostrar un * utiliza: (" * ")
		 */
		
		for(int i = 0; i < altura; i++) {
			
			for(int j = 0; j < base; j++) {
				
				System.out.print(" * ");
			}
			
			System.out.println("");
		}
		
	}
	
	public void dibujaConWhile() {
		/* Utilizando Ãºnicamente como estructura
		 * repetitiva el while, dar soluciÃ³n a lo solicitado
		 * Para mostrar un * utiliza: (" * ")
		 */
		int i = 0;
		int j = 0;
		
		while(i < base) {
			
			while(i < j) {
				
				System.out.println("");
				
				j++;
			}
		
		System.out.print (" * ");
			
		i++;
			
		}			 
		
	}
	
	public void dibujaConDoWhile() {
		/* Utilizando Ãºnicamente como estructura
		 * repetitiva el do...while, dar soluciÃ³n a lo solicitado
		 * Para mostrar un * utiliza: (" * ")
		 */
		int i = 0, j = 0;
		
		do {
			
			do {
				
				System.out.print(" * ");
				
				i++;
				
			}while(i < base);
			
			System.out.println("");
			
			j++;
			
		}while(j < altura);
		
	}
}
