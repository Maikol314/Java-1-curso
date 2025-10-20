package actividad02;

public class AppCafetera {

	public static void main(String[] args) {
		
		Cafetera cafetera = new Cafetera();
		
		cafetera.capacidadMax(100);
		
		cafetera.llenarCafetera();
		
		cafetera.cantidadActual();
		
		cafetera.vaciarCafetera();
		
		cafetera.cantidadActual();
		
		cafetera.agregarCafe(65);
		
		cafetera.servirCafe(70);
		
		cafetera.servirCafe(60);
		
		cafetera.servirCafe(5);
		
		cafetera.cantidadActual();
		
		cafetera.llenarCafetera();
		
		cafetera.servirCafe(cafetera.cantidadActual);

	}

}
