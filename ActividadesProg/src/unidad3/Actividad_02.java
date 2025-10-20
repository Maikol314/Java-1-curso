package unidad3;

public class Actividad_02 {

	public static void main(String[] args) {
		
		System.out.println("Ahora el programa va a generar un número aleatorio y saldrá si es par o impar");
		
		int num_random = (int)(Math.random() * 100);
		
		System.out.println("El número aleatorio es el " + num_random);
		
		if (num_random % 2 == 0) {
			
			System.out.println("El número aleatorio es par");
		}
		else {
			
			System.out.println("El número aleatorio es impar");
		}

	}

}
