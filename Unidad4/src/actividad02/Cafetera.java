package actividad02;

public class Cafetera {
	
	int capacidadMax;
	int cantidadActual;
	
	void capacidadMax(int cc) {
		
		capacidadMax = cc;
	}
	
	void llenarCafetera() {
		
		cantidadActual = capacidadMax;
	}
	
	void vaciarCafetera() {
		
		cantidadActual = 0;
	}
	
	void cantidadActual() {
		
		System.out.println("La cantidad actual de cafe es " + cantidadActual + " litros");
	}
	
	void agregarCafe(int cc) {
		
		if((cc + cantidadActual) <= capacidadMax) {
			
			cantidadActual += cc;
		}
		
		else {
			
			cantidadActual = capacidadMax;
		}
	}
	
	void servirCafe(int cc) {
		
		if(cantidadActual == 0) {
			
			System.out.println("No hay café en la cafetera");
		}
		
		else if(cc > cantidadActual) {
			
			System.out.println("No hay suficiente café");
		}
		
		else {
			
			System.out.println("Café servido");
			
			cantidadActual -= cc;
		}
	}

}
