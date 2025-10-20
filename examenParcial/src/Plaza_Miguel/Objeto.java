package Plaza_Miguel;

public class Objeto {
	// Ã�rea de datos
	private int id;      // Identificador del objeto 
	private Pieza p1;
	private Pieza p2;
	
	// Constructores
	public Objeto (int idObjeto, int idPieza1, byte vidaUtilP1, int idPieza2, byte vidaUtilP2) {
		// Completar cÃ³digo
		id = idObjeto;
		idPieza1 = p1.getId();
		vidaUtilP1 = p1.getVidaUtil();
		idPieza2 = p2.getId();
		vidaUtilP2 = p2.getVidaUtil();
	}
	
	public Objeto (int id, Pieza p1, Pieza p2) {
		// Completar cÃ³digo
		this.id = id;
		this.p1 = p1; 
		this.p2 = p2;
	}
	
	// MÃ©todos getter/setter
	public int getId() {
		return id;
	}
	
	// MÃ©todos generales
	public void mostrarDatosObjeto() {
		// Tiene que mostrar cada dato y valor del objeto
		// de la forma mÃ¡s "eficiente" posible
		System.out.println("**** Datos del objeto ****");
		// completar aquÃ­
		System.out.println("El id del objeto es " + id);
		System.out.println("El id de la pieza 1 del objeto es " + p1.getId());
		System.out.println("El id de la pieza 2 del objeto es " + p2.getId());
		System.out.println("La vida útil de la pieza 1 del objeto es " + p1.getVidaUtil());
		System.out.println("La vida útil de la pieza 2 del objeto es " + p2.getVidaUtil());
		
		System.out.println("**************************");
	}
	
	public void usarObjeto() {
		// Solo se podrÃ¡ usar un objeto si las piezas NO han llegado a su vida Ãºtil
		// Usar un objeto supone utilizar las 2 piezas que lo componen.
		// Completa el cÃ³digo que falta
		
		if(p1.getTiempoDeUso() > p1.getVidaUtil()) {
			
			System.out.println ("La pieza "+p1.getId()+" del objeto " 
			+ id + " ha llegado al final de su vida Ãºtil. Debe ser cambiada");
		}
		
		else if(p2.getTiempoDeUso() > p2.getVidaUtil()) {
			
			System.out.println ("La pieza "+p2.getId()+" del objeto " 
			+ id + " ha llegado al final de su vida Ãºtil. Debe ser cambiada");
		}
		
		else {
			
			System.out.println("El ojeto "+id+" ha sido usado correctamente");
			
			p1.usarPieza();
			p2.usarPieza();
		}	

	}
	
	public void cambiarPieza1() {
		// MÃ©todo que permita cambiar la pieza 1. 
		// Solo se podrÃ¡ cambiar la pieza 1 si ha llegado al final de su vida Ãºtil.
		// Completa el cÃ³digo 
		
		if(p1.getVidaUtil() > p1.getTiempoDeUso()) {
			
			System.out.println ("No es procedente el cambio de pieza 1: " + p1.getId());
		}
		
		else {
			
			System.out.println ("Pieza 1 cambiada correctamente");
			
			p1.cambiarPieza();
		}
		
	}
	
	public void cambiarPieza2() {
		// MÃ©todo que permita cambiar la pieza 2.
		// Solo se podrÃ¡ cambiar la pieza 2 si ha llegado al final de su vida Ãºtil.
		// Completa el cÃ³digo 
		
		if(p2.getVidaUtil() > p2.getTiempoDeUso()) {
			
			System.out.println ("No es procedente el cambio de pieza 2: " + p2.getId());
		}
		
		else {
			
			System.out.println ("Pieza 2 cambiada correctamente");
			
			p2.cambiarPieza();
		}
		
	}
}
