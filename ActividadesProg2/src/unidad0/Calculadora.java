package unidad0;

public class Calculadora {
	
	int sumar(int num1, int num2) {
		
		return num1 + num2;
	}
	
	int restar(int num1, int num2) {
		
		return num1 - num2;
	}
	
	int multiplicar(int num1, int num2) {
		
		return num1 * num2;
	}
	
	double dividir(int num1, int num2) {
		
		if(num2 == 0) {
			
			System.out.println("Error: No se puede dividir entre 0");
			
			return 0;
		}
		
		return (double) num1 / num2;
	}

}
