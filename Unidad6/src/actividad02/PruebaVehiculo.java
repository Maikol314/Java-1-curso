package actividad02;

public class PruebaVehiculo {

	public static void main(String[] args) {
		
		Coche cochePepe = new Coche("0000BBB", "Gris plata");
		cochePepe.set_numPuertas(3);
		
		Coche cocheMaria = new Coche("1111CCC", "Rojo");
		cocheMaria.set_numPuertas(5);
		
		System.out.println(cochePepe);
		System.out.println(cocheMaria);
		
		Moto motoPepe = new Moto("2222BBB", "Negro");
		motoPepe.set_numPlazas(2);
		
		System.out.println(motoPepe);

	}

}
