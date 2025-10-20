package Plaza_Miguel;

public class AppObjeto {

	public static void main(String[] args) {
		/* Completa lo que va pidiendo cada comentario justo debajo
		 * del mismo
		 */
		
		// Crea un objeto (obj1) con los siguientes datos:
		// ID:1  idP1:100, vidaUtilP1:4, idP2:101, vidaUtilP2:3
		Objeto obj1 = new Objeto(1, 100, 4, 101, 3);
		
		// Crea una pieza (p1) con ID:103 y vida útil: 5
		Pieza p1 = new Pieza(103, p1.getVidaUtil());
		
		// Crea otra pieza (p2) con ID:104 y vida útil: 5
		Pieza p2 = new Pieza(104, p2.getVidaUtil()); 
		
		// Crea otro objeto (obj2) con ID:2 y las piezas (p1) y (p2)
		Objeto obj2 = new Objeto(2, p1, p2);
		// Creadas anteriormente.
		
		
		// Usa (obj1) 4 veces seguidas.
		
		for(int i = 0; i < 4; i++) {
			
			obj1.usarObjeto();
		}
		
		// Cambia la pieza 1 de (obj1)
		
		obj1.cambiarPieza1();
		
		// Cambia la pieza 2 de (obj1)
		
		obj2.cambiarPieza2();
		
		// Usa (obj1) 2 veces
		
		for(int i = 0; i < 2; i++) {
			
			obj1.usarObjeto();
		}
		
		// Muestra los datos de (obj2)
		
		obj2.mostrarDatosObjeto();
		
		// Usa el objeto (ob2) 6 veces seguidas
		
		for(int i = 0; i < 6; i++) {
			
			obj2.usarObjeto();
		}
		
		// cambia la pieza 1 de (obj2)
		
		obj2.cambiarPieza1();
		
		// Usa el objeto (obj2)
		
		obj2.usarObjeto();
		
		// cambia la pieza 2 de (obj2)
		
		obj2.cambiarPieza2();
		
		// Muestra los datos de (obj2)
		
		obj2.mostrarDatosObjeto();
		
	}
}
