package actividad03;

public class MatesXY {

	static int x = 0, y = 0;
	
	static void intercambiar() {
		
		int aux;
		
		System.out.println("Intercambio de valores:");
		System.out.println("Valores iniciales; x = " + x + " e y = " + y);
		
		aux = x;
		x = y;
		y = aux;
		
		System.out.println("Valores finales; x = " + x + " e y = " + y);
	}
	
	static int sumar() {
		
		System.out.println(x + " + " + y + " = " + (x + y));
		
		return x + y;
	}
	
	static int restar() {
		
		System.out.println(x + " - " + y + " = " + (x - y));
		
		return x - y;
	}
	
	static int multiplicar() {
		
		System.out.println(x + " x " + y + " = " + (x * y));
		
		return x * y;
	}
	
	static int divEntera() {
		
		if (y != 0) {
			
			System.out.println(x + " / " + y + " = " + (x / y));
			
			return x / y;
		}
		
		else {
			
			System.out.println("No es posible dividir un número entre 0");
			
			return 0;
		}
		

	}
	
	static int resDivEntera() {
		
		if (y != 0) {
			
			System.out.println("El resto de la división de " + x + " / " + y + " es de " + x % y);
			
			return x % y;
		}
		
		else {
			
			System.out.println("No es posible dividir un número entre 0");
			
			return 0;
		}

	}
	
	static int abs() {
		
		if (x < 0) {
			
			System.out.println("|" + x + "| = " + (-x));
			
			return -x;
		}
		
		else {
			
			System.out.println("|" + x + "| = " + x);
			
			return x;
		}
		
	}
	
	static int mayor() {
		
		if (x > y) {
			
			System.out.println("El número mayor es " + x);
			
			return x;
		}
		
		else if (x < y) {
			
			System.out.println("El número mayor es " + y);
			
			return y;
		}
		
		else {
			
			System.out.println("Los dos números son iguales");
			
			return 0;
		}
	}
	
	static void sonIguales() {
		
		if (x == y) {
			
			System.out.println("Los números son iguales");
		}
		
		else {
			
			System.out.println("Los números no son iguales");
		}
	}

	
}
