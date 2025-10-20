package actividad01;

public class AppPunto2D {

	public static void main(String[] args) {
		
		Punto2D p = new Punto2D();
		
		p.coord_x();
		p.coord_y();
		
		p.cambiarLocalizacion(1, 1);
		
		p.trasladar(3, 3);
		
		int x = p.x;
		System.out.println("X = " + x);
		
		Punto2D p2 = new Punto2D();
		
		p2.iguales(p);
		
		System.out.println(p.mostrarPunto());

	}

}
