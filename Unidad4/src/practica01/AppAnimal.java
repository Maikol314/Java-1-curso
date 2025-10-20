package practica01;

public class AppAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		
		animal1.setNombre("Martin");
		animal1.setEdad(9);
		
		animal1.nace(); 
		
		System.out.println(". Me llamo " + animal1.getNombre() + " y tengo " + animal1.getEdad() + " años");

	}

}
