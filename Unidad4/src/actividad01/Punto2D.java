package actividad01;

public class Punto2D {
	
	int x, y;
	
	void coord_x() {
		
		System.out.println("Coordenada X = " + x);
	}
	
	void coord_y() {
		
		System.out.println("Coordenada Y = " + y);
	}
	
	void cambiarLocalizacion(int x2, int y2) {
		
		x = x2;
		y = y2;
	}
	
	void trasladar(int dx, int dy) {
		
		x = x + dx;
		y = y + dy;
	}
	
	void iguales(Punto2D p) {
		
		if(x == p.x && y == p.y) {
			
			System.out.println("Los puntos son iguales");
		}
		
		else {
			
			System.out.println("Los puntos no son iguales");
		}
	}
	
	int getX() {
		
		return x;
	}
	
	int getY() {
		
		return y;
	}
	
	String mostrarPunto() {
		
		return "El punto tiene de coordenadas (x, y) -> (" + x + ", " + y + ")";
	}

}
