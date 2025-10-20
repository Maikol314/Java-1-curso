package unidad3;

public class Actividad_15 {

	public static void main(String[] args) {
		
		int filas = 1;
		
		do {
			
			int numero = 1;
			
			do {
				
				System.out.print(numero);
				
				numero += 1;
				
			} while (numero <= filas);
			
			System.out.println();
			
			filas += 1;
			
		} while (filas < 10);

	}

}
