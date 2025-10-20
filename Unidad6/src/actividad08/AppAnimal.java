package actividad08;

public class AppAnimal {

	public static void main(String[] args) {
		
		Sonido perro = new Perro();
		Sonido gato = new Gato();
		Sonido canario = new Canario();
		Sonido relojCucu = new RelojCucu();
		
		EmisorSonidos emisor = new EmisorSonidos();
		
		emisor.reproduceSonido(perro);
		emisor.reproduceSonido(gato);
		emisor.reproduceSonido(canario);
		emisor.reproduceSonido(relojCucu);

	}

}
