package actividad08;

public class Hucha {
	
	private String estado;
	private int billetes, monedas1, monedas2, total;
	
	Hucha(String estado, int billetes, int monedas1, int monedas2){
		
		this.estado = estado;
		this.billetes = billetes;
		this.monedas1 = monedas1;
		this.monedas2 = monedas2;
		total = billetes * 5 + monedas1 + monedas2 * 2;
	}
	
	void abrirHucha() {
		
		estado = "abierta";
		
		System.out.println("La hucha ahora está abierta");
	}
	
	void ingresar(int monedas1, int monedas2, int billetes) {
		
		total += monedas1 + monedas2 * 2 + billetes * 5;
		this.monedas1 += monedas1;
		this.monedas2 += monedas2;
		this.billetes += billetes;
		
		System.out.println("Se ha añadido el dinero correctamente");
	}
	
	double valorTotal() {
		
		return total;
	}
	
	boolean hayBilletes() {
		
		if (billetes == 0) {
			
			return false;
		}
		
		else {
			
			return true;
		}
	}
	
	void sacarBilletes(int billetes) {
		
		if (estado != "abierta") {
			
			System.out.println("La hucha esta cerrada y no se puede sacar dinero");
		}
		
		else if (billetes > this.billetes) {
			
			System.out.println("Estas intentando sacar mas billetes de los disponibles en la hucha");
		}
		
		else {
			
			this.billetes -= billetes;
			total -= billetes;
			
			System.out.println("Se ha sacado el dinero correctamente");
		}
	}

}
